# Multithreading in Java

## Introduction to Multithreading

Multithreading is a concept in Java that allows concurrent execution of multiple threads within the same process. Each thread represents a separate flow of control, enabling programs to perform multiple tasks simultaneously. In Java, multithreading is achieved by extending the `Thread` class or implementing the `Runnable` interface.

### Basic Concepts

1. **Thread**: A thread is the smallest unit of execution within a process. Java provides built-in support for threads via the `Thread` class.

2. **Runnable Interface**: The `Runnable` interface is used to create a thread. It requires implementing a single method, `run()`, which contains the code to be executed by the thread.

3. **Thread States**: Threads in Java can be in one of the following states:
   - **New**: When a thread is created but not yet started.
   - **Runnable**: When a thread is ready to run and waiting for its turn to be picked for execution by the CPU.
   - **Blocked/Waiting**: When a thread is temporarily inactive because it's waiting for an external event such as I/O operation or lock acquisition.
   - **Timed Waiting**: Similar to Blocked state but with a timeout.
   - **Terminated**: When a thread has completed execution or terminated due to an exception.

### Creating Threads

#### Extending `Thread` Class

```java
class MyThread extends Thread {
    public void run() {
        // Thread code
    }
}

// Creating and starting the thread
MyThread thread = new MyThread();
thread.start();
```

#### Implementing `Runnable` Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        // Thread code
    }
}

// Creating a thread using Runnable interface
Thread thread = new Thread(new MyRunnable());
thread.start();
```

### Thread Synchronization

When multiple threads access shared resources concurrently, it can lead to data inconsistency or corruption. Thread synchronization ensures that only one thread can access the shared resource at a time, preventing data races and maintaining data integrity. Java provides several mechanisms for thread synchronization, such as synchronized methods, synchronized blocks, and locks.

#### Synchronized Method

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
```

#### Synchronized Block

```java
class Counter {
    private int count = 0;

    public void increment() {
        synchronized(this) {
            count++;
        }
    }

    public int getCount() {
        synchronized(this) {
            return count;
        }
    }
}
```

### Thread Communication

Thread communication allows threads to coordinate their activities and share data. Java provides mechanisms such as wait(), notify(), and notifyAll() methods for thread communication.

#### Using wait() and notify()

```java
class SharedResource {
    private boolean flag = false;

    public synchronized void produce() {
        while (flag) {
            try {
                wait(); // Wait until consumer consumes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Produce the resource
        flag = true;
        notify(); // Notify consumer
    }

    public synchronized void consume() {
        while (!flag) {
            try {
                wait(); // Wait until producer produces
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Consume the resource
        flag = false;
        notify(); // Notify producer
    }
}
```

### Thread Pooling

Thread pooling is a technique where a group of threads are created and managed by a thread pool manager. Instead of creating a new thread for every task, threads from the pool are used, which improves performance and reduces overhead.

#### Using ExecutorService

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    public void run() {
        // Task code
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Create a thread pool with 5 threads
        for (int i = 0; i < 10; i++) {
            executor.submit(new MyTask()); // Submit tasks to the pool
        }
        executor.shutdown(); // Shutdown the executor
    }
}
```

### Thread Safety

Thread safety is the property of a program that ensures correct behavior when executed concurrently by multiple threads. Techniques such as synchronization, atomic variables, and thread-safe data structures are used to achieve thread safety.

### Conclusion

Multithreading in Java enables efficient utilization of resources and improves program performance by executing multiple tasks concurrently. However, it also introduces challenges such as thread synchronization and thread safety, which need to be carefully managed to ensure correct program behavior. With proper understanding and implementation of multithreading concepts, developers can build robust and scalable Java applications.

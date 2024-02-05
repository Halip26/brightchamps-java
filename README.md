# Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Public static vs Private static

1. Public static
   - public: The method or variable can be accessed from anywhere, either from the class itself, from a class in the same package, or from a class in another package.
   - static: The method or variable is associated with the class, not with an object instance. This means that you can call a method or access a variable without creating an object of the class.
2 Private static
   - private: A method or variable can only be accessed from within the class itself. It cannot be accessed from other classes, even if the other classes are in the same package.
   - static: The method or variable is associated with the class, not with an object instance. This means that you can call a method or access a variable without creating an object of the class.

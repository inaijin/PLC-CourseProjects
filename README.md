# FunctionCraft Compiler Projects Spring 2024

This repository contains a collection of compiler projects completed as part of the PLC (Programming Language Concepts) Course at UT-CE in Spring 2024. The projects involve building a compiler for the functional programming language, FunctionCraft. Each project covers different phases of compiler construction, from lexical analysis to code generation.

## Project Descriptions

1. [CA1: Lexical/Syntactic Analyzer](#ca1-lexicalsyntactic-analyzer)
2. [CA2: Name Analyzer](#ca2-name-analyzer)
3. [CA3: Type Analyzer](#ca3-type-analyzer)
4. [CA4: Code Generation](#ca4-code-generation)

### [CA1: Lexical/Syntactic Analyzer](https://github.com/inaijin/PLC-CourseProjects/tree/main/CA1_Phase1%20-%20Lexical%3ASyntactic%20Analyzer)
**Description**: In this phase, we designed the grammar and defined lexical tokens for FunctionCraft. The lexical and syntactic analyzer parses the source code into a structured format that the compiler can process.

**Features**:
- Lexical analysis: Tokenizes the input source code.
- Syntax analysis: Checks for syntactic correctness according to the defined grammar.

### [CA2: Name Analyzer](https://github.com/inaijin/PLC-CourseProjects/tree/main/CA2_Phase2%20-%20Name%20Analyzer)
**Description**: In this phase, we implemented a name analyzer to catch naming errors in FunctionCraft programs. The name analyzer ensures that all identifiers are declared before use and that there are no duplicate declarations in the same scope.

**Features**:
- Scope management: Handles variable scopes and nested scopes.
- Error detection: Identifies undeclared variables and duplicate declarations.

### [CA3: Type Analyzer](https://github.com/inaijin/PLC-CourseProjects/tree/main/CA3_Phase3%20-%20Type%20Analyzer)
**Description**: This phase involves type checking and type inference for FunctionCraft, an interpreted language where types are determined at runtime. The type analyzer ensures that type rules are followed and infers the types of variables.

**Features**:
- Type checking: Validates operations based on operand types.
- Type inference: Deduces the types of variables based on usage.

### [CA4: Code Generation](https://github.com/inaijin/PLC-CourseProjects/tree/main/CA4_Phase4%20-%20Code%20Generation)
**Description**: In the final phase, we integrated all previous phases and implemented code generation. The compiler translates FunctionCraft code into pseudo Java code using Jasmin bytecode, which is then executed on the Java Virtual Machine (JVM).

**Features**:
- Integration: Combines lexical analysis, name analysis, and type analysis.
- Code generation: Converts FunctionCraft code to Jasmin bytecode.
- Execution: Runs the generated code on the JVM.

## Contributing
Feel free to fork this repository, open issues, or submit pull requests. Any contributions are welcome!

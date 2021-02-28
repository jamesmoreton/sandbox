# Sandbox

[![CI/CD Status](https://github.com/jamesmoreton/sandbox/actions/workflows/ci.yml/badge.svg)](https://github.com/jamesmoreton/sandbox/actions/workflows/ci.yml)

Sandbox app.

### Features

- Compiles & runs under Java 15
- Built with Maven
- Built as Docker image & pushed to repository on Docker Hub
- Utilises the following tools:
    - [GitHub Actions](https://docs.github.com/en/actions) as a CI/CD pipeline
    - [CODEOWNERS](https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/about-code-owners) to define those who are responsible for code in the repo
    - [Dependabot](https://docs.github.com/en/github/administering-a-repository/keeping-your-dependencies-updated-automatically) to keep Maven dependencies updated to the latest versions
    - [Mergeable](https://github.com/mergeability/mergeable) to ensure pull requests follow conventions
  
### Local Setup

From the root directory `sandbox`, build the project to create JAR file:

```
mvn -B package --file pom.xml
```

Build Docker image called `sandbox`:

```
docker build -t sandbox .
```

Run Docker image `sandbox` as container:

```
docker run sandbox
```
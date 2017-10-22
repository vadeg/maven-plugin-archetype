# Maven plugins archetype

Maven archetype allows you to generate maven project for building maven plugins.

## Getting Started

* Execute command `mvn install` to install plugin locally.
* Execute command 
```
mvn archetype:generate -DarchetypeGroupId=com.github.vadeg -DarchetypeArtifactId=maven-plugin-archetype -DarchetypeVersion=1.0.0-SNAPSHOT
```
* Specify `groupId`, `artifactId` and `version`.

### Prerequisites

* Java 8
* Maven 3.x

## Contributing

Please read [CONTRIBUTING](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/vadeg/maven-plugin-archetype/tags). 

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

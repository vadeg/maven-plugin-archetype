# Maven plugins archetype

Maven archetype allows you to generate maven project for building maven plugins.

## Install archetype plugin

`mvn install`

## Getting Started

You can create project executing command 
```
mvn archetype:generate -DarchetypeGroupId=com.github.vadeg -DarchetypeArtifactId=maven-plugin-archetype -DarchetypeVersion=1.0.0-SNAPSHOT
```

By default created project will use maven `3.5.0`. If you want to use another maven version add `-DmavenVersion=<your version>`
property to command above.

### Prerequisites

* Java 8
* Maven 3.2 or later

## Contributing

Please read [CONTRIBUTING](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/vadeg/maven-plugin-archetype/tags). 

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

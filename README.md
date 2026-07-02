# BetterMC Chicken Loose Feathers

A simple Minecraft plugin that makes chickens drop **feathers** whenever they lay an **egg**.

No more killing chickens for feathers!

## Features

- Chickens drop 1 to 3 feathers when laying an egg
- Configurable maximum feather amount
- Reload config without server restart

## Requirements

- Minecraft 26.2+
- Paper/Spigot server
- Java 25

## Installation

1. Download `BetterMCChickenLooseFeathers-x.x.x.jar` from [Releases](https://github.com/Vaatik/better-mc-chicken-loose-feathers/releases)
2. Place the jar in your server's `plugins/` folder
3. Restart your server

## Configuration

```yaml
# config.yml

# Maximum number of feathers a chicken can drop when laying an egg.
# The actual amount will be random between 1 and this value.
# WARNING: Values above 15-20 may impact performance on large chicken farms.
maxFeatherAmount: 3
```

## Commands

| Command | Description |
|---------|-------------|
| `/chickenfeather reload` | Reload the configuration |

## Building from source

```bash
./gradlew shadowJar
```

Output: `build/libs/BetterMCChickenLooseFeathers-x.x.x.jar`

## Migration from ChickenShedder

This plugin is a complete rewrite of the original ChickenShedder plugin:
- Renamed to Chicken Loose Feathers
- Migrated from Java/Maven to Kotlin/Gradle
- Zombie leather feature removed (now a separate plugin: [better-mc-zombie-leather](https://github.com/Vaatik/better-mc-zombie-leather))

## License

GPL v3

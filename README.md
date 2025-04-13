# 🐔 ChickenJockey


---

## 📖 Features
- Automatically detects chicken jockeys and renames them as such
- Fires a custom `ChickenJockeySpawnEvent` for plugins like [DiscordSRV](https://modrinth.com/plugin/discordsrv/versions) to hook into.
- Lightweight and optimized for performance. Chicken jockeys will still despawn like normal
- 
---

### Installation
1. Download the latest release of the plugin from the [Releases](https://github.com/derex4/ChickenJockey/releases) page.
2. Place the `ChickenJockey.jar` file into your server's `plugins` folder.
3. Restart your server.
4. Enjoy the enhanced chicken jockey experience!

---

## ⚙️ Configuration
No configuration is required! The plugin works out of the box.

---

## 🛠️ Developer API

ChickenJockey provides a custom event for developers to hook into:

### `ChickenJockeySpawnEvent`
This event is triggered whenever a chicken jockey spawns. You can listen to this event to add custom behavior.

#### Example:
```java
@EventHandler
public void onChickenJockeySpawn(ChickenJockeySpawnEvent event) {
    Entity jockey = event.getJockey();
    Chicken chicken = event.getChicken();

    // Custom behavior
    Bukkit.broadcastMessage("A Chicken Jockey has spawned! Jockey: " + jockey.getType());
}
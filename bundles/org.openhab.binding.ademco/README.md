# Ademco Binding

This binding provides support for Eyezon Envisalink 3/4 IP modules when connected to a Honeywell/Ademco system (Like the Vista 20p). If you have an Envisalink module and a DSC-based alarm system, use the dscalarm openHAB binding.

With this binding, you have full control of your alarm system - just like having another alarm panel. Arm/disarm partitions, configure chime, view zone conditions - if you can do it from your alarm panel, you can now automate it!

## Supported Things

This binding has been tested to work with the Envisalink 4 module. There are minor differences with the Envisalink 3 module noted in the documentation, but it is expected that most features work.

There are 3 types of things supported by this binding - the Envisalink module itself, the alarm partition(s), and the alarm zones.

## Discovery

The Envisalink module must be configured first. Auto-discovery is available if the module is in the same network segment configured in your openHAB settings.

Once communication has been established with the Envisalink module, the binding will auto-discover the alarm partition(s) and add them to the inbox. Alarm zones are auto-discovered and added to the inbox when they change state.

## Thing Configuration

These are the configuration options for the Envisalink Bridge:

|   Option    | Description                                          |
|-------------|------------------------------------------------------|
| IP Address  | The IP address of the Envlisalink interface.         |
| Port        | The TCP port to the Envisalink interface.            |
| Password    | The password to log into the Envisalink interface (same as the web interface password). |
| Connection Timeout | TCP socket connection timeout (milliseconds). |
| Poll Period | Poll period (minutes).                               |

These are the configuration options for the Alarm partition(s):

|   Option         | Description                  |
|------------------|------------------------------|
| Partition Number | The partition number (1-8)   |
| UserCode         | Arm/disarm code              |

These are the configuration options for the Alarm zones:

|   Option    | Description                  |
|-------------|------------------------------|
| Zone Number | The alarm zone number (1-64) |

## Channels

Partition Channels:

| Channel                  | Type             | Description              |
|--------------------------|------------------|--------------------------|
| Partition Status         | Partition Status | Status of the Partition  |
| Message                  | Status           | Message received from the panel |
| Partition in Alarm       | Status           | Is the partition in alarm state? |
| Alarm in Memory          | Status           | Alarm condition in memory |
| Partition in ArmedAway   | Button           | Partition is set to armed - away |
| AC Present               | Status           | Panel has AC Power. |
| Partition in Bypass      | Status           | Partition has been bypassed. |
| Partition Chime Mode     | Button           | Partition chime setting. |
| Armed Instant            | Button           | Partition is in the "Instant Arm" state. |
| Partition Fire Alarm set | Status           | Partition fire alarm ready |
| Partition is in Trouble  | Status           | Partition trouble state - check message. |
| Partition is Ready       | Status           | Partition is ready for arming. |
| Partition in Fire        | Status           | Partition in fire alarm condition |
| Partition Low in Battery | Status           | Low battery condition |
| Partition in Arm Stay    | Button           | Partition in Arm Stay |
| Arm Partition            | arm_mode         | Arm partition to AWAY, STAY, INSTANT, or OFF |

Zone Channels:

| Channel               | Type        | Description                 |
|-----------------------|-------------|-----------------------------|
| Zone Status           | zone_status | Zone Status (Open/Closed)   |
| Zone Bypass Mode      | bypass_mode | Zone Bypass (OFF=active, ON=bypased) |
| Zone in Alarm         | Status      | Zone is in alarm state      |
| Check Zone            | Status      | Check zone for issues       |
| Zone Low Battery      | Status      | Zone has a low battery. Replace soon. |
| Zone Fault            | Status      | Zone has a fault.           |
| Zone Last Update Time | datetime    | When the zone last updated. |

## Full Example

_Provide a full usage example based on textual configuration files (*.things, *.items, *.sitemap)._

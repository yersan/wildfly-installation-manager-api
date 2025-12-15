package org.wildfly.installationmanager;

import java.util.List;

/**
 * Provides list of available manifest versions for given channel.
 */
public class AvailableManifestVersions {

    private final String channelName;
    private final String location;
    private final ManifestVersionPair currentVersion;
    private final List<ManifestVersionPair> availableVersions;

    public AvailableManifestVersions(String channelName, String location, ManifestVersionPair currentVersion, List<ManifestVersionPair> availableVersions) {
        this.channelName = channelName;
        this.location = location;
        this.currentVersion = currentVersion;
        this.availableVersions = availableVersions;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getLocation() {
        return location;
    }

    public ManifestVersionPair getCurrentVersion() {
        return currentVersion;
    }

    public List<ManifestVersionPair> getAvailableVersions() {
        return availableVersions;
    }
}

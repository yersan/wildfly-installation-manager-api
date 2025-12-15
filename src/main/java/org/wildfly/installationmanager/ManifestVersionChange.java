package org.wildfly.installationmanager;

/**
 * Represents possible Channel Manifest version change that would happen if user proceeds with an update operation.
 */
public class ManifestVersionChange {

    private final String channelName;
    private final String location;
    private final ManifestVersionPair currentVersion;
    private final ManifestVersionPair newVersion;
    private final boolean isDowngrade;

    /**
     * Constructor
     *
     * @param channelName name of the channel associated with a manifest which is to be updated
     * @param location manifest location (Maven GA(V) or URL)
     * @param currentVersion current manifest version
     * @param newVersion the new manifest version to be updated to
     * @param isDowngrade is this version change considered a downgrade?
     */
    public ManifestVersionChange(String channelName, String location, ManifestVersionPair currentVersion, ManifestVersionPair newVersion, boolean isDowngrade) {
        this.channelName = channelName;
        this.location = location;
        this.currentVersion = currentVersion;
        this.newVersion = newVersion;
        this.isDowngrade = isDowngrade;
    }

    /**
     * @return name of the channel associated with a manifest which is to be updated
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @return manifest location (Maven GA(V) or URL)
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return current manifest version
     */
    public ManifestVersionPair getCurrentVersion() {
        return currentVersion;
    }

    /**
     * @return the new manifest version to be updated to
     */
    public ManifestVersionPair getNewVersion() {
        return newVersion;
    }

    /**
     * @return is this version change considered a downgrade?
     */
    public boolean isDowngrade() {
        return isDowngrade;
    }

}

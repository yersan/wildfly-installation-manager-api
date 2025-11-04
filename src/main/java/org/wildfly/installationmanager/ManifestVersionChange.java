package org.wildfly.installationmanager;

/**
 * Represents possible Channel Manifest version change that would happen if user proceeds with an update operation.
 */
public class ManifestVersionChange {

    private final String channelName;
    private final String location;
    private final String currentVersion;
    private final String newVersion;
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
    public ManifestVersionChange(String channelName, String location, String currentVersion, String newVersion, boolean isDowngrade) {
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
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * @return the new manifest version to be updated to
     */
    public String getNewVersion() {
        return newVersion;
    }

    /**
     * @return is this version change considered a downgrade?
     */
    public boolean isDowngrade() {
        return isDowngrade;
    }
}

package org.wildfly.installationmanager;

import java.util.Objects;

/**
 * Wraps a pair of manifest physical/logical version strings.
 */
public class ManifestVersionPair {
    private final String physicalVersion;
    private final String logicalVersion;

    /**
     * Pair of physical / logical version strings.
     *
     * @param physicalVersion version string, either a maven artifact version for Maven-based channels,
     *                        or a URL for URL-based channels
     * @param logicalVersion  descriptive version string intended for human understanding, optional
     */
    public ManifestVersionPair(String physicalVersion, String logicalVersion) {
        this.physicalVersion = physicalVersion;
        this.logicalVersion = logicalVersion;
    }

    /**
     * @return descriptive version string intended for human understanding, optional
     */
    public String getLogicalVersion() {
        return logicalVersion;
    }

    /**
     * @return physicalVersion version string, either a maven artifact version for Maven-based channels,
     * or a URL for URL-based channels
     */
    public String getPhysicalVersion() {
        return physicalVersion;
    }

    @Override
    public String toString() {
        return "ManifestVersionPair{" +
                "physicalVersion='" + physicalVersion + '\'' +
                ", logicalVersion='" + logicalVersion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ManifestVersionPair that = (ManifestVersionPair) o;
        return Objects.equals(physicalVersion, that.physicalVersion) && Objects.equals(logicalVersion, that.logicalVersion);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(physicalVersion);
        result = 31 * result + Objects.hashCode(logicalVersion);
        return result;
    }
}

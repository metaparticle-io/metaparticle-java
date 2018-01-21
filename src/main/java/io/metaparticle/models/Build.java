/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.metaparticle.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Build model.
 */
public class Build {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The path property.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * The imageName property.
     */
    @JsonProperty(value = "imageName")
    private String imageName;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Build object itself.
     */
    public Build withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the Build object itself.
     */
    public Build withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the imageName value.
     *
     * @return the imageName value
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the imageName value.
     *
     * @param imageName the imageName value to set
     * @return the Build object itself.
     */
    public Build withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

}

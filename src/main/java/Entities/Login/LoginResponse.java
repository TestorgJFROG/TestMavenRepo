package Entities.Login;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "admin",
        "profileUpdatable",
        "internalPasswordDisabled",
        "lastLoggedInMillis",
        "offlineMode",
        "disableUIAccess",
        "proWithoutLicense",
        "canDeploy",
        "canManage",
        "preventAnonAccessBuild",
        "existsInDB",
        "requireProfileUnlock",
        "requireProfilePassword",
        "numberOfGroups",
        "numberOfPermissions"
})

public class LoginResponse {


    @JsonProperty("name")
    private String name;
    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("profileUpdatable")
    private Boolean profileUpdatable;
    @JsonProperty("internalPasswordDisabled")
    private Boolean internalPasswordDisabled;
    @JsonProperty("lastLoggedInMillis")
    private Integer lastLoggedInMillis;
    @JsonProperty("offlineMode")
    private Boolean offlineMode;
    @JsonProperty("disableUIAccess")
    private Boolean disableUIAccess;
    @JsonProperty("proWithoutLicense")
    private Boolean proWithoutLicense;
    @JsonProperty("canDeploy")
    private Boolean canDeploy;
    @JsonProperty("canManage")
    private Boolean canManage;
    @JsonProperty("preventAnonAccessBuild")
    private Boolean preventAnonAccessBuild;
    @JsonProperty("existsInDB")
    private Boolean existsInDB;
    @JsonProperty("requireProfileUnlock")
    private Boolean requireProfileUnlock;
    @JsonProperty("requireProfilePassword")
    private Boolean requireProfilePassword;
    @JsonProperty("numberOfGroups")
    private Integer numberOfGroups;
    @JsonProperty("numberOfPermissions")
    private Integer numberOfPermissions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @JsonProperty("profileUpdatable")
    public Boolean getProfileUpdatable() {
        return profileUpdatable;
    }

    @JsonProperty("profileUpdatable")
    public void setProfileUpdatable(Boolean profileUpdatable) {
        this.profileUpdatable = profileUpdatable;
    }

    @JsonProperty("internalPasswordDisabled")
    public Boolean getInternalPasswordDisabled() {
        return internalPasswordDisabled;
    }

    @JsonProperty("internalPasswordDisabled")
    public void setInternalPasswordDisabled(Boolean internalPasswordDisabled) {
        this.internalPasswordDisabled = internalPasswordDisabled;
    }

    @JsonProperty("lastLoggedInMillis")
    public Integer getLastLoggedInMillis() {
        return lastLoggedInMillis;
    }

    @JsonProperty("lastLoggedInMillis")
    public void setLastLoggedInMillis(Integer lastLoggedInMillis) {
        this.lastLoggedInMillis = lastLoggedInMillis;
    }

    @JsonProperty("offlineMode")
    public Boolean getOfflineMode() {
        return offlineMode;
    }

    @JsonProperty("offlineMode")
    public void setOfflineMode(Boolean offlineMode) {
        this.offlineMode = offlineMode;
    }

    @JsonProperty("disableUIAccess")
    public Boolean getDisableUIAccess() {
        return disableUIAccess;
    }

    @JsonProperty("disableUIAccess")
    public void setDisableUIAccess(Boolean disableUIAccess) {
        this.disableUIAccess = disableUIAccess;
    }

    @JsonProperty("proWithoutLicense")
    public Boolean getProWithoutLicense() {
        return proWithoutLicense;
    }

    @JsonProperty("proWithoutLicense")
    public void setProWithoutLicense(Boolean proWithoutLicense) {
        this.proWithoutLicense = proWithoutLicense;
    }

    @JsonProperty("canDeploy")
    public Boolean getCanDeploy() {
        return canDeploy;
    }

    @JsonProperty("canDeploy")
    public void setCanDeploy(Boolean canDeploy) {
        this.canDeploy = canDeploy;
    }

    @JsonProperty("canManage")
    public Boolean getCanManage() {
        return canManage;
    }

    @JsonProperty("canManage")
    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    @JsonProperty("preventAnonAccessBuild")
    public Boolean getPreventAnonAccessBuild() {
        return preventAnonAccessBuild;
    }

    @JsonProperty("preventAnonAccessBuild")
    public void setPreventAnonAccessBuild(Boolean preventAnonAccessBuild) {
        this.preventAnonAccessBuild = preventAnonAccessBuild;
    }

    @JsonProperty("existsInDB")
    public Boolean getExistsInDB() {
        return existsInDB;
    }

    @JsonProperty("existsInDB")
    public void setExistsInDB(Boolean existsInDB) {
        this.existsInDB = existsInDB;
    }

    @JsonProperty("requireProfileUnlock")
    public Boolean getRequireProfileUnlock() {
        return requireProfileUnlock;
    }

    @JsonProperty("requireProfileUnlock")
    public void setRequireProfileUnlock(Boolean requireProfileUnlock) {
        this.requireProfileUnlock = requireProfileUnlock;
    }

    @JsonProperty("requireProfilePassword")
    public Boolean getRequireProfilePassword() {
        return requireProfilePassword;
    }

    @JsonProperty("requireProfilePassword")
    public void setRequireProfilePassword(Boolean requireProfilePassword) {
        this.requireProfilePassword = requireProfilePassword;
    }

    @JsonProperty("numberOfGroups")
    public Integer getNumberOfGroups() {
        return numberOfGroups;
    }

    @JsonProperty("numberOfGroups")
    public void setNumberOfGroups(Integer numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @JsonProperty("numberOfPermissions")
    public Integer getNumberOfPermissions() {
        return numberOfPermissions;
    }

    @JsonProperty("numberOfPermissions")
    public void setNumberOfPermissions(Integer numberOfPermissions) {
        this.numberOfPermissions = numberOfPermissions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

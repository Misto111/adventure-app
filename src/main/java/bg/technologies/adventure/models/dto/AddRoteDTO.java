package bg.technologies.adventure.models.dto;

public class AddRoteDTO {

    private String name;

    private String description;

    private int level;

    private String videoUrl;


    public String getName() {
        return name;
    }

    public AddRoteDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddRoteDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public AddRoteDTO setLevel(int level) {
        this.level = level;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public AddRoteDTO setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
}

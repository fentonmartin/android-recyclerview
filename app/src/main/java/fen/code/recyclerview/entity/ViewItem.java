package fen.code.recyclerview.entity;

/**
 * Created by FEN on 06/06/2017.
 */

public class ViewItem {

    private int image;
    private String description;

    public ViewItem(int tutorialImage, String tutorialDescription) {
        image = tutorialImage;
        description = tutorialDescription;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

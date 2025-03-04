package tr.edu.maltepe.oop;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cats {
    private int age;
    private String name;

    public Cats(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public int get_age()
    {
        return age;
    }

    public String get_name()
    {
        return name;
    }

    public void set_age(int age)
    {
        this.age = age;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    public static void playMeowSound() {
        try {
            // Load the meow sound file
            File soundFile = new File("C:\\Users\\Huawei pc\\Downloads\\Cat meow sound effect.wav"); // Make sure the path is correct
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Get the clip to play the sound
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Play the sound
            clip.start();

            // Wait for the sound to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000); // Convert microseconds to milliseconds
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}

package iou.gui;

import iou.util.GuiUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class AppLauncher {

    private static final Logger LOGGER = Logger.getLogger(AppLauncher.class);

    /**
     * @param args
     * @throws java.io.FileNotFoundException
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        InputStream log4jConfig = AppLauncher.class.getResourceAsStream("/log4j.properties");
        PropertyConfigurator.configure(log4jConfig);
        LOGGER.debug("Launching login window");

        // Load the application's icon
        URL imageFile = AppLauncher.class.getResource("/gui/dollar.gif");
        LOGGER.debug("Loading application icon from: " + imageFile);
        Image appImage = Toolkit.getDefaultToolkit().getImage(imageFile);
        GuiUtils.setApplicationImage(appImage);

        // Create an instance of the login window and pass along any args
        LoginFrame.main(args);
    }
}

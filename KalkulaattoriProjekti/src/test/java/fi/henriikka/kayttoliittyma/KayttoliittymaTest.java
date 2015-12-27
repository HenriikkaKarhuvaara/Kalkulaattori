/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.kayttoliittyma;

import fi.henriikka.kalkulaattori.Main;
import java.awt.Frame;
import javax.swing.JFrame;
import org.assertj.swing.core.GenericTypeMatcher;
import static org.assertj.swing.finder.WindowFinder.findFrame;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import static org.assertj.swing.launcher.ApplicationLauncher.application;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author henriikkakarhuvaara
 */
public class KayttoliittymaTest extends AssertJSwingJUnitTestCase {
    FrameFixture window;
    
   
    @Test
    public void testRun() {
        
    }

  
    @Override
    protected void onSetUp() {
        application(Main.class).start();

        window = findFrame(new GenericTypeMatcher<Frame>(Frame.class) {
            protected boolean isMatching(Frame frame) {
                return frame.isShowing();
            }
        }).using(robot());        
    }   
     
}

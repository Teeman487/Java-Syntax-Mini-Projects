package com.adebusoye.javaKeyBindings70;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

//*************************************************
public class Main{

    public static void main(String[] args ){

        // Key Bindings = 	bind an Action to a KeyStroke
        //					don't require you to click a component to give it focus
        //					all Swing components use Key Bindings
        //					increased flexibility compared to KeyListeners
        //					can assign keystrokes to individual Swing components
        //					more difficult to utilize and set up :(

        Game game = new Game();
    }
}
//*************************************************


/*class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game(){

        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }
}*/


//*************************************************

//25
//
//
//        Reply
//
//
//        3 replies
//@gamingwithgavin1283
//@gamingwithgavin1283
//3 years ago
//        Bro Code thank you!
//
//        1
//
//
//        Reply
//
//@sohamdokhale8816
//@sohamdokhale8816
//3 years ago
//        Thank u very much
//
//        2
//
//
//        Reply
//
//@joyceasante8292
//@joyceasante8292
//11 months ago
//        Practicing....

/*public class Main{

    public static void main(String[]args){

        Game game = new Game();
    }
}*/



class Game
{
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game ()
    {
        frame = new JFrame ();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize (210, 210);
        frame.setLayout (null);

        label = new JLabel ();
        label.setBackground (Color.black);

        label.getInputMap ().put (KeyStroke.getKeyStroke ('w'), upAction);
        label.getActionMap ().put (upAction, upAction);

        label.getInputMap ().put (KeyStroke.getKeyStroke ('s'), upAction);
        label.getActionMap ().put (downAction, downAction);

        label.getInputMap ().put (KeyStroke.getKeyStroke ('a'), upAction);
        label.getActionMap ().put (leftAction, leftAction);

        label.getInputMap ().put (KeyStroke.getKeyStroke ('d'), upAction);
        label.getActionMap ().put (rightAction, rightAction);

        frame.add (label);
        frame.setVisible (true);


    }

    public class upAction extends AbstractAction
    {

        @Override public void actionPerformed (ActionEvent e)
        {
            label.setLocation (label.getX (), label.getY () - 10);
        }
    }

    public class downAction extends AbstractAction
    {

        @Override public void actionPerformed (ActionEvent e)
        {
            label.setLocation (label.getX (), label.getY () + 10);
        }
    }


    public class leftAction extends AbstractAction
    {

        @Override public void actionPerformed (ActionEvent e)
        {
            label.setLocation (label.getX () - 10, label.getY ());
        }
    }

    public class rightAction extends AbstractAction
    {

        @Override public void actionPerformed (ActionEvent e)
        {
            label.setLocation (label.getX () + 10, label.getY ());
        }
    }
}

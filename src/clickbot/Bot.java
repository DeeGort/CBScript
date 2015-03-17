package clickbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author DeeGort
 */
public class Bot {
    
    protected Robot bot;
    protected int x, y;
    
    public Bot() throws AWTException{
            bot = new Robot();
    }
    
    public void delay(int ms){
        try {
            Thread.sleep(ms);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void move(int x, int y){
        this.x = x;
        this.y = y;
        bot.mouseMove(x, y); 
    }
    
    public void hit_begin(String str){
        if (str.toUpperCase().equals("ENTER")){
            bot.keyPress(KeyEvent.VK_ENTER);
        }
        else if (str.toUpperCase().equals("BACK_SPACE"))
            bot.keyPress(KeyEvent.VK_BACK_SPACE); 
        else if (str.toUpperCase().equals("TAB"))
            bot.keyPress(KeyEvent.VK_TAB); 
        else if (str.toUpperCase().equals("CANCEL"))
            bot.keyPress(KeyEvent.VK_CANCEL); 
        else if (str.toUpperCase().equals("CLEAR"))
            bot.keyPress(KeyEvent.VK_CLEAR); 
        else if (str.toUpperCase().equals("SHIFT"))
            bot.keyPress(KeyEvent.VK_SHIFT); 
        else if (str.toUpperCase().equals("CONTROL"))
            bot.keyPress(KeyEvent.VK_CONTROL); 
        else if (str.toUpperCase().equals("ALT"))
            bot.keyPress(KeyEvent.VK_ALT); 
        else if (str.toUpperCase().equals("PAUSE"))
            bot.keyPress(KeyEvent.VK_PAUSE); 
        else if (str.toUpperCase().equals("CAPS_LOCK"))
            bot.keyPress(KeyEvent.VK_CAPS_LOCK); 
        else if (str.toUpperCase().equals("ESCAPE"))
            bot.keyPress(KeyEvent.VK_ESCAPE); 
        else if (str.toUpperCase().equals("VK_SPACE"))
            bot.keyPress(KeyEvent.VK_SPACE);
        else if (str.toUpperCase().equals("PAGE_UP"))
            bot.keyPress(KeyEvent.VK_PAGE_UP); 
        else if (str.toUpperCase().equals("PAGE_DOWN"))
            bot.keyPress(KeyEvent.VK_PAGE_DOWN); 
        else if (str.toUpperCase().equals("END"))
            bot.keyPress(KeyEvent.VK_END); 
        else if (str.toUpperCase().equals("HOME"))
            bot.keyPress(KeyEvent.VK_HOME);
        else if (str.toUpperCase().equals("LEFT"))
            bot.keyPress(KeyEvent.VK_LEFT); 
        else if (str.toUpperCase().equals("LEFT"))
            bot.keyPress(KeyEvent.VK_LEFT); 
        else if (str.toUpperCase().equals("UP"))
            bot.keyPress(KeyEvent.VK_UP); 
        else if (str.toUpperCase().equals("RIGHT"))
            bot.keyPress(KeyEvent.VK_RIGHT); 
        else if (str.toUpperCase().equals("DOWN"))
            bot.keyPress(KeyEvent.VK_DOWN);
        else if (str.toUpperCase().equals("DELETE"))
            bot.keyPress(KeyEvent.VK_DELETE);
        else if (str.toUpperCase().equals("NUM_LOCK"))
            bot.keyPress(KeyEvent.VK_NUM_LOCK);
        else if (str.toUpperCase().equals("SCROLL_LOCK"))
            bot.keyPress(KeyEvent.VK_SCROLL_LOCK);
        else if (str.toUpperCase().equals("F1"))
            bot.keyPress(KeyEvent.VK_F1);
        else if (str.toUpperCase().equals("F2"))
            bot.keyPress(KeyEvent.VK_F2);
        else if (str.toUpperCase().equals("F3"))
            bot.keyPress(KeyEvent.VK_F3);
        else if (str.toUpperCase().equals("F4"))
            bot.keyPress(KeyEvent.VK_F4);
        else if (str.toUpperCase().equals("F5"))
            bot.keyPress(KeyEvent.VK_F5);
        else if (str.toUpperCase().equals("F6"))
            bot.keyPress(KeyEvent.VK_F6);
        else if (str.toUpperCase().equals("F7"))
            bot.keyPress(KeyEvent.VK_F7);
        else if (str.toUpperCase().equals("F8"))
            bot.keyPress(KeyEvent.VK_F8);
        else if (str.toUpperCase().equals("F9"))
            bot.keyPress(KeyEvent.VK_F9);
        else if (str.toUpperCase().equals("F10"))
            bot.keyPress(KeyEvent.VK_F10);
        else if (str.toUpperCase().equals("F11"))
            bot.keyPress(KeyEvent.VK_F11);
        else if (str.toUpperCase().equals("F12"))
            bot.keyPress(KeyEvent.VK_F12);
        else if (str.toUpperCase().equals("PRINTSCREEN"))
            bot.keyPress(KeyEvent.VK_PRINTSCREEN);
        else if (str.toUpperCase().equals("INSERT"))
            bot.keyPress(KeyEvent.VK_INSERT);
        else if (str.toUpperCase().equals("HELP"))
            bot.keyPress(KeyEvent.VK_HELP);
        else if (str.toUpperCase().equals("META"))
            bot.keyPress(KeyEvent.VK_META);
        else if (str.toUpperCase().equals("WINDOWS"))
            bot.keyPress(KeyEvent.VK_WINDOWS);
        else if (str.toUpperCase().equals("CUT"))
            bot.keyPress(KeyEvent.VK_CUT);
        else if (str.toUpperCase().equals("COPY"))
            bot.keyPress(KeyEvent.VK_COPY);
        else if (str.toUpperCase().equals("PASTE"))
            bot.keyPress(KeyEvent.VK_PASTE);
        else if (str.toUpperCase().equals("UNDO"))
            bot.keyPress(KeyEvent.VK_UNDO);
        else if (str.toUpperCase().equals("AGAIN") || str.toUpperCase().equals("REDO"))
            bot.keyPress(KeyEvent.VK_AGAIN);
        else if (str.toUpperCase().equals("FIND"))
            bot.keyPress(KeyEvent.VK_FIND);
        else if (str.toUpperCase().equals("PROPS"))
            bot.keyPress(KeyEvent.VK_STOP);
        else if (str.toUpperCase().equals("ALT_GRAPH") || str.toUpperCase().equals("ALTGRAPH") || str.toUpperCase().equals("ALTGR"))
            bot.keyPress(KeyEvent.VK_ALT_GRAPH);
        else if (str.toUpperCase().equals("LEFT_MOUSE"))
            bot.mousePress(InputEvent.BUTTON1_MASK);
        else if (str.toUpperCase().equals("RIGHT_MOUSE"))
            bot.mousePress(InputEvent.BUTTON3_MASK);
        else if (str.toUpperCase().equals("MIDDLE_MOUSE"))
            bot.mousePress(InputEvent.BUTTON2_MASK);
        
        
        else if (str.charAt(0) == ',')
            bot.keyPress(KeyEvent.VK_COMMA); 
        else if (str.charAt(0) == '-')
            bot.keyPress(KeyEvent.VK_MINUS);
        else if (str.charAt(0) == '.')
            bot.keyPress(KeyEvent.VK_PERIOD);
        else if (str.charAt(0) == '/')
            bot.keyPress(KeyEvent.VK_SLASH);
        else if (str.charAt(0) == '0')
            bot.keyPress(KeyEvent.VK_0);
        else if (str.charAt(0) == '1')
            bot.keyPress(KeyEvent.VK_1);
        else if (str.charAt(0) == '2')
            bot.keyPress(KeyEvent.VK_2);
        else if (str.charAt(0) == '3')
            bot.keyPress(KeyEvent.VK_3);
        else if (str.charAt(0) == '4')
            bot.keyPress(KeyEvent.VK_4);
        else if (str.charAt(0) == '5')
            bot.keyPress(KeyEvent.VK_5);
        else if (str.charAt(0) == '6')
            bot.keyPress(KeyEvent.VK_6);
        else if (str.charAt(0) == '7')
            bot.keyPress(KeyEvent.VK_7);
        else if (str.charAt(0) == '8')
            bot.keyPress(KeyEvent.VK_8);
        else if (str.charAt(0) == '9')
            bot.keyPress(KeyEvent.VK_9);
        else if (str.charAt(0) == ';')
            bot.keyPress(KeyEvent.VK_SEMICOLON);
        else if (str.charAt(0) == '=')
            bot.keyPress(KeyEvent.VK_EQUALS);
        else if (str.toUpperCase().charAt(0) == 'A')
            bot.keyPress(KeyEvent.VK_A);
        else if (str.toUpperCase().charAt(0) == 'B')
            bot.keyPress(KeyEvent.VK_B);
        else if (str.toUpperCase().charAt(0) == 'C')
            bot.keyPress(KeyEvent.VK_C);
        else if (str.toUpperCase().charAt(0) == 'D')
            bot.keyPress(KeyEvent.VK_D);
        else if (str.toUpperCase().charAt(0) == 'E')
            bot.keyPress(KeyEvent.VK_E);
        else if (str.toUpperCase().charAt(0) == 'F')
            bot.keyPress(KeyEvent.VK_F);
        else if (str.toUpperCase().charAt(0) == 'G')
            bot.keyPress(KeyEvent.VK_G);
        else if (str.toUpperCase().charAt(0) == 'H')
            bot.keyPress(KeyEvent.VK_H);
        else if (str.toUpperCase().charAt(0) == 'I')
            bot.keyPress(KeyEvent.VK_I);
        else if (str.toUpperCase().charAt(0) == 'J')
            bot.keyPress(KeyEvent.VK_J);
        else if (str.toUpperCase().charAt(0) == 'K')
            bot.keyPress(KeyEvent.VK_K);
        else if (str.toUpperCase().charAt(0) == 'L')
            bot.keyPress(KeyEvent.VK_L);
        else if (str.toUpperCase().charAt(0) == 'M')
            bot.keyPress(KeyEvent.VK_M);
        else if (str.toUpperCase().charAt(0) == 'N')
            bot.keyPress(KeyEvent.VK_N);
        else if (str.toUpperCase().charAt(0) == 'O')
            bot.keyPress(KeyEvent.VK_O);
        else if (str.toUpperCase().charAt(0) == 'P')
            bot.keyPress(KeyEvent.VK_P);
        else if (str.toUpperCase().charAt(0) == 'Q')
            bot.keyPress(KeyEvent.VK_Q);
        else if (str.toUpperCase().charAt(0) == 'R')
            bot.keyPress(KeyEvent.VK_R);
        else if (str.toUpperCase().charAt(0) == 'S')
            bot.keyPress(KeyEvent.VK_S);
        else if (str.toUpperCase().charAt(0) == 'T')
            bot.keyPress(KeyEvent.VK_T);
        else if (str.toUpperCase().charAt(0) == 'U')
            bot.keyPress(KeyEvent.VK_U);
        else if (str.toUpperCase().charAt(0) == 'V')
            bot.keyPress(KeyEvent.VK_V);
        else if (str.toUpperCase().charAt(0) == 'W')
            bot.keyPress(KeyEvent.VK_W);
        else if (str.toUpperCase().charAt(0) == 'X')
            bot.keyPress(KeyEvent.VK_X);
        else if (str.toUpperCase().charAt(0) == 'Y')
            bot.keyPress(KeyEvent.VK_Y);
        else if (str.toUpperCase().charAt(0) == 'Z')
            bot.keyPress(KeyEvent.VK_Z);
        else if (str.charAt(0) == '[')
            bot.keyPress(KeyEvent.VK_OPEN_BRACKET);
        else if (str.charAt(0) == '\\')
            bot.keyPress(KeyEvent.VK_BACK_SLASH);
        else if (str.charAt(0) == ']')
            bot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
        // Numpad is missing yet
     /*   else if (str.toUpperCase().equals("*"))
            bot.keyPress(KeyEvent.VK_MULTIPLY);*/
    /*    else if (str.toUpperCase().equals("+"))
            bot.keyPress(KeyEvent.VK_ADD);*/
        else if (str.charAt(0) == '`')
            bot.keyPress(KeyEvent.VK_BACK_QUOTE);
        else if (str.charAt(0) == '\'')
            bot.keyPress(KeyEvent.VK_QUOTE);
        else if (str.charAt(0) == '&')
            bot.keyPress(KeyEvent.VK_AMPERSAND);
        else if (str.charAt(0) == '*')
            bot.keyPress(KeyEvent.VK_ASTERISK);
        else if (str.charAt(0) == '\"')
            bot.keyPress(KeyEvent.VK_QUOTEDBL);
        else if (str.charAt(0) == '<')
            bot.keyPress(KeyEvent.VK_LESS);
        else if (str.charAt(0) == '>')
            bot.keyPress(KeyEvent.VK_GREATER);
        else if (str.charAt(0) == '{')
            bot.keyPress(KeyEvent.VK_BRACELEFT);
        else if (str.charAt(0) == '}')
            bot.keyPress(KeyEvent.VK_BRACERIGHT);
        else if (str.charAt(0) == '@')
            bot.keyPress(KeyEvent.VK_AT);
        else if (str.charAt(0) == ':')
            bot.keyPress(KeyEvent.VK_COLON);
        else if (str.charAt(0) == '^')
            bot.keyPress(KeyEvent.VK_CIRCUMFLEX);
        else if (str.charAt(0) == '$')
            bot.keyPress(KeyEvent.VK_DOLLAR);
        else if (str.charAt(0) == '€')
            bot.keyPress(KeyEvent.VK_EURO_SIGN);
        else if (str.charAt(0) == '!')
            bot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
        else if (str.charAt(0) == '(')
            bot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);
        else if (str.charAt(0) == ')')
            bot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);
        else if (str.charAt(0) == '#')
            bot.keyPress(KeyEvent.VK_NUMBER_SIGN);
        else if (str.charAt(0) == '+'){
            bot.keyPress(KeyEvent.VK_SHIFT);
            bot.keyPress(KeyEvent.VK_EQUALS);
        }
        else if (str.charAt(0) == '_'){
            bot.keyPress(KeyEvent.VK_SHIFT);
            bot.keyPress(KeyEvent.VK_MINUS);
        }
    }
    
    public void hit_end(String str){
        if (str.toUpperCase().equals("ENTER")){
            bot.keyRelease(KeyEvent.VK_ENTER);
        }
        else if (str.toUpperCase().equals("BACK_SPACE"))
            bot.keyRelease(KeyEvent.VK_BACK_SPACE); 
        else if (str.toUpperCase().equals("TAB"))
            bot.keyRelease(KeyEvent.VK_TAB); 
        else if (str.toUpperCase().equals("CANCEL"))
            bot.keyRelease(KeyEvent.VK_CANCEL); 
        else if (str.toUpperCase().equals("CLEAR"))
            bot.keyRelease(KeyEvent.VK_CLEAR); 
        else if (str.toUpperCase().equals("SHIFT"))
            bot.keyRelease(KeyEvent.VK_SHIFT); 
        else if (str.toUpperCase().equals("CONTROL"))
            bot.keyRelease(KeyEvent.VK_CONTROL); 
        else if (str.toUpperCase().equals("ALT"))
            bot.keyRelease(KeyEvent.VK_ALT); 
        else if (str.toUpperCase().equals("PAUSE"))
            bot.keyRelease(KeyEvent.VK_PAUSE); 
        else if (str.toUpperCase().equals("CAPS_LOCK"))
            bot.keyRelease(KeyEvent.VK_CAPS_LOCK); 
        else if (str.toUpperCase().equals("ESCAPE"))
            bot.keyRelease(KeyEvent.VK_ESCAPE); 
        else if (str.toUpperCase().equals("VK_SPACE"))
            bot.keyRelease(KeyEvent.VK_SPACE);
        else if (str.toUpperCase().equals("PAGE_UP"))
            bot.keyRelease(KeyEvent.VK_PAGE_UP); 
        else if (str.toUpperCase().equals("PAGE_DOWN"))
            bot.keyRelease(KeyEvent.VK_PAGE_DOWN); 
        else if (str.toUpperCase().equals("END"))
            bot.keyRelease(KeyEvent.VK_END); 
        else if (str.toUpperCase().equals("HOME"))
            bot.keyRelease(KeyEvent.VK_HOME);
        else if (str.toUpperCase().equals("LEFT"))
            bot.keyRelease(KeyEvent.VK_LEFT); 
        else if (str.toUpperCase().equals("LEFT"))
            bot.keyRelease(KeyEvent.VK_LEFT); 
        else if (str.toUpperCase().equals("UP"))
            bot.keyRelease(KeyEvent.VK_UP); 
        else if (str.toUpperCase().equals("RIGHT"))
            bot.keyRelease(KeyEvent.VK_RIGHT); 
        else if (str.toUpperCase().equals("DOWN"))
            bot.keyRelease(KeyEvent.VK_DOWN);
        else if (str.toUpperCase().equals("DELETE"))
            bot.keyRelease(KeyEvent.VK_DELETE);
        else if (str.toUpperCase().equals("NUM_LOCK"))
            bot.keyRelease(KeyEvent.VK_NUM_LOCK);
        else if (str.toUpperCase().equals("SCROLL_LOCK"))
            bot.keyRelease(KeyEvent.VK_SCROLL_LOCK);
        else if (str.toUpperCase().equals("F1"))
            bot.keyRelease(KeyEvent.VK_F1);
        else if (str.toUpperCase().equals("F2"))
            bot.keyRelease(KeyEvent.VK_F2);
        else if (str.toUpperCase().equals("F3"))
            bot.keyRelease(KeyEvent.VK_F3);
        else if (str.toUpperCase().equals("F4"))
            bot.keyRelease(KeyEvent.VK_F4);
        else if (str.toUpperCase().equals("F5"))
            bot.keyRelease(KeyEvent.VK_F5);
        else if (str.toUpperCase().equals("F6"))
            bot.keyRelease(KeyEvent.VK_F6);
        else if (str.toUpperCase().equals("F7"))
            bot.keyRelease(KeyEvent.VK_F7);
        else if (str.toUpperCase().equals("F8"))
            bot.keyRelease(KeyEvent.VK_F8);
        else if (str.toUpperCase().equals("F9"))
            bot.keyRelease(KeyEvent.VK_F9);
        else if (str.toUpperCase().equals("F10"))
            bot.keyRelease(KeyEvent.VK_F10);
        else if (str.toUpperCase().equals("F11"))
            bot.keyRelease(KeyEvent.VK_F11);
        else if (str.toUpperCase().equals("F12"))
            bot.keyRelease(KeyEvent.VK_F12);
        else if (str.toUpperCase().equals("PRINTSCREEN"))
            bot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        else if (str.toUpperCase().equals("INSERT"))
            bot.keyRelease(KeyEvent.VK_INSERT);
        else if (str.toUpperCase().equals("HELP"))
            bot.keyRelease(KeyEvent.VK_HELP);
        else if (str.toUpperCase().equals("META"))
            bot.keyRelease(KeyEvent.VK_META);
        else if (str.toUpperCase().equals("WINDOWS"))
            bot.keyRelease(KeyEvent.VK_WINDOWS);
        else if (str.toUpperCase().equals("CUT"))
            bot.keyRelease(KeyEvent.VK_CUT);
        else if (str.toUpperCase().equals("COPY"))
            bot.keyRelease(KeyEvent.VK_COPY);
        else if (str.toUpperCase().equals("PASTE"))
            bot.keyRelease(KeyEvent.VK_PASTE);
        else if (str.toUpperCase().equals("UNDO"))
            bot.keyRelease(KeyEvent.VK_UNDO);
        else if (str.toUpperCase().equals("AGAIN") || str.toUpperCase().equals("REDO"))
            bot.keyRelease(KeyEvent.VK_AGAIN);
        else if (str.toUpperCase().equals("FIND"))
            bot.keyRelease(KeyEvent.VK_FIND);
        else if (str.toUpperCase().equals("PROPS"))
            bot.keyRelease(KeyEvent.VK_STOP);
        else if (str.toUpperCase().equals("ALT_GRAPH") || str.toUpperCase().equals("ALTGRAPH") || str.toUpperCase().equals("ALTGR"))
            bot.keyRelease(KeyEvent.VK_ALT_GRAPH);
        else if (str.toUpperCase().equals("LEFT_MOUSE"))
            bot.mouseRelease(InputEvent.BUTTON1_MASK);
        else if (str.toUpperCase().equals("RIGHT_MOUSE"))
            bot.mouseRelease(InputEvent.BUTTON3_MASK);
        else if (str.toUpperCase().equals("MIDDLE_MOUSE"))
            bot.mouseRelease(InputEvent.BUTTON2_MASK);
        
        else if (str.charAt(0) == ',')
            bot.keyRelease(KeyEvent.VK_COMMA); 
        else if (str.charAt(0) == '-')
            bot.keyRelease(KeyEvent.VK_MINUS);
        else if (str.charAt(0) == '.')
            bot.keyRelease(KeyEvent.VK_PERIOD);
        else if (str.charAt(0) == '/')
            bot.keyRelease(KeyEvent.VK_SLASH);
        else if (str.charAt(0) == '0')
            bot.keyRelease(KeyEvent.VK_0);
        else if (str.charAt(0) == '1')
            bot.keyRelease(KeyEvent.VK_1);
        else if (str.charAt(0) == '2')
            bot.keyRelease(KeyEvent.VK_2);
        else if (str.charAt(0) == '3')
            bot.keyRelease(KeyEvent.VK_3);
        else if (str.charAt(0) == '4')
            bot.keyRelease(KeyEvent.VK_4);
        else if (str.charAt(0) == '5')
            bot.keyRelease(KeyEvent.VK_5);
        else if (str.charAt(0) == '6')
            bot.keyRelease(KeyEvent.VK_6);
        else if (str.charAt(0) == '7')
            bot.keyRelease(KeyEvent.VK_7);
        else if (str.charAt(0) == '8')
            bot.keyRelease(KeyEvent.VK_8);
        else if (str.charAt(0) == '9')
            bot.keyRelease(KeyEvent.VK_9);
        else if (str.charAt(0) == ';')
            bot.keyRelease(KeyEvent.VK_SEMICOLON);
        else if (str.charAt(0) == '=')
            bot.keyRelease(KeyEvent.VK_EQUALS);
        else if (str.toUpperCase().charAt(0) == 'A')
            bot.keyRelease(KeyEvent.VK_A);
        else if (str.toUpperCase().charAt(0) == 'B')
            bot.keyRelease(KeyEvent.VK_B);
        else if (str.toUpperCase().charAt(0) == 'C')
            bot.keyRelease(KeyEvent.VK_C);
        else if (str.toUpperCase().charAt(0) == 'D')
            bot.keyRelease(KeyEvent.VK_D);
        else if (str.toUpperCase().charAt(0) == 'E')
            bot.keyRelease(KeyEvent.VK_E);
        else if (str.toUpperCase().charAt(0) == 'F')
            bot.keyRelease(KeyEvent.VK_F);
        else if (str.toUpperCase().charAt(0) == 'G')
            bot.keyRelease(KeyEvent.VK_G);
        else if (str.toUpperCase().charAt(0) == 'H')
            bot.keyRelease(KeyEvent.VK_H);
        else if (str.toUpperCase().charAt(0) == 'I')
            bot.keyRelease(KeyEvent.VK_I);
        else if (str.toUpperCase().charAt(0) == 'J')
            bot.keyRelease(KeyEvent.VK_J);
        else if (str.toUpperCase().charAt(0) == 'K')
            bot.keyRelease(KeyEvent.VK_K);
        else if (str.toUpperCase().charAt(0) == 'L')
            bot.keyRelease(KeyEvent.VK_L);
        else if (str.toUpperCase().charAt(0) == 'M')
            bot.keyRelease(KeyEvent.VK_M);
        else if (str.toUpperCase().charAt(0) == 'N')
            bot.keyRelease(KeyEvent.VK_N);
        else if (str.toUpperCase().charAt(0) == 'O')
            bot.keyRelease(KeyEvent.VK_O);
        else if (str.toUpperCase().charAt(0) == 'P')
            bot.keyRelease(KeyEvent.VK_P);
        else if (str.toUpperCase().charAt(0) == 'Q')
            bot.keyRelease(KeyEvent.VK_Q);
        else if (str.toUpperCase().charAt(0) == 'R')
            bot.keyRelease(KeyEvent.VK_R);
        else if (str.toUpperCase().charAt(0) == 'S')
            bot.keyRelease(KeyEvent.VK_S);
        else if (str.toUpperCase().charAt(0) == 'T')
            bot.keyRelease(KeyEvent.VK_T);
        else if (str.toUpperCase().charAt(0) == 'U')
            bot.keyRelease(KeyEvent.VK_U);
        else if (str.toUpperCase().charAt(0) == 'V')
            bot.keyRelease(KeyEvent.VK_V);
        else if (str.toUpperCase().charAt(0) == 'W')
            bot.keyRelease(KeyEvent.VK_W);
        else if (str.toUpperCase().charAt(0) == 'X')
            bot.keyRelease(KeyEvent.VK_X);
        else if (str.toUpperCase().charAt(0) == 'Y')
            bot.keyRelease(KeyEvent.VK_Y);
        else if (str.toUpperCase().charAt(0) == 'Z')
            bot.keyRelease(KeyEvent.VK_Z);
        else if (str.charAt(0) == '[')
            bot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
        else if (str.charAt(0) == '\\')
            bot.keyRelease(KeyEvent.VK_BACK_SLASH);
        else if (str.charAt(0) == ']')
            bot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
        // Numpad is missing yet
     /*   else if (str.toUpperCase().equals("*"))
            bot.keyRelease(KeyEvent.VK_MULTIPLY);*/
    /*    else if (str.toUpperCase().equals("+"))
            bot.keyRelease(KeyEvent.VK_ADD);*/
        else if (str.charAt(0) == '`')
            bot.keyRelease(KeyEvent.VK_BACK_QUOTE);
        else if (str.charAt(0) == '\'')
            bot.keyRelease(KeyEvent.VK_QUOTE);
        else if (str.charAt(0) == '&')
            bot.keyRelease(KeyEvent.VK_AMPERSAND);
        else if (str.charAt(0) == '*')
            bot.keyRelease(KeyEvent.VK_ASTERISK);
        else if (str.charAt(0) == '\"')
            bot.keyRelease(KeyEvent.VK_QUOTEDBL);
        else if (str.charAt(0) == '<')
            bot.keyRelease(KeyEvent.VK_LESS);
        else if (str.charAt(0) == '>')
            bot.keyRelease(KeyEvent.VK_GREATER);
        else if (str.charAt(0) == '{')
            bot.keyRelease(KeyEvent.VK_BRACELEFT);
        else if (str.charAt(0) == '}')
            bot.keyRelease(KeyEvent.VK_BRACERIGHT);
        else if (str.charAt(0) == '@')
            bot.keyRelease(KeyEvent.VK_AT);
        else if (str.charAt(0) == ':')
            bot.keyRelease(KeyEvent.VK_COLON);
        else if (str.charAt(0) == '^')
            bot.keyRelease(KeyEvent.VK_CIRCUMFLEX);
        else if (str.charAt(0) == '$')
            bot.keyRelease(KeyEvent.VK_DOLLAR);
        else if (str.charAt(0) == '€')
            bot.keyRelease(KeyEvent.VK_EURO_SIGN);
        else if (str.charAt(0) == '!')
            bot.keyRelease(KeyEvent.VK_EXCLAMATION_MARK);
        else if (str.charAt(0) == '(')
            bot.keyRelease(KeyEvent.VK_LEFT_PARENTHESIS);
        else if (str.charAt(0) == ')')
            bot.keyRelease(KeyEvent.VK_RIGHT_PARENTHESIS);
        else if (str.charAt(0) == '#')
            bot.keyRelease(KeyEvent.VK_NUMBER_SIGN);
        else if (str.charAt(0) == '+'){
            bot.keyRelease(KeyEvent.VK_EQUALS);
            bot.keyRelease(KeyEvent.VK_SHIFT);
        }
        else if (str.charAt(0) == '_'){
            bot.keyRelease(KeyEvent.VK_MINUS);
            bot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }
    public void hit(String str){
        hit_begin(str);
        delay(10);
        hit_end(str);
        delay(10);
    }
    
    public void type(String str){
        for(int i = 0; i != str.length(); i++)
            hit(Character.toString(str.charAt(i)));
    }

    public void click(String mode, int multiplier)
    {   
        if ((mode.toLowerCase().equals("left")) || (mode.toLowerCase().equals("l")))
        for (int i = 0; i < multiplier; i++)
        {
            bot.mousePress(InputEvent.BUTTON1_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
        else if ((mode.toLowerCase().equals("mid")) || (mode.toLowerCase().equals("m")))
        for (int i = 0; i < multiplier; i++)
        {
            bot.mousePress(InputEvent.BUTTON2_MASK);
            bot.mouseRelease(InputEvent.BUTTON2_MASK);
        }
        else if ((mode.toLowerCase().equals("right")) || (mode.toLowerCase().equals("r")))
        for (int i = 0; i < multiplier; i++)
        {
            bot.mousePress(InputEvent.BUTTON3_MASK);
            bot.mouseRelease(InputEvent.BUTTON3_MASK);
        }
    }
}

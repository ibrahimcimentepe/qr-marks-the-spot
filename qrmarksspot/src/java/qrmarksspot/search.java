/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import com.sun.data.provider.impl.ListDataProvider;
import com.sun.rave.faces.data.DefaultSelectItemsArray;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Listbox;
import com.sun.webui.jsf.model.DefaultOptionsList;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import Classes.MySqlConnection;
import Classes.GameAttributes;
import java.util.*;
import java.sql.ResultSet;
import java.util.Arrays;



//import java.awt.*;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version search.java
 * @version Created on 05.Ara.2011, 18:31:22
 * @author 23
 */

public class search extends AbstractPageBean {
    String []searchResults={""};
    String searchString;
    String criteria;
    String selectedGame;
    String textt;
    String searchCategory;
    public String getSearchCategory() {
        return searchCategory;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }

    public String getTextt() {
        return textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }
    
    public String[] getsearchResults() {
        return searchResults;
    }

    public void setsearchResults(String[] searchResults) {
        this.searchResults = searchResults;
        this.dropdown2DefaultItems.setItems(searchResults);
    }

    public String getSelectedGame() {
        return selectedGame;
    }

    public void setSelectedGame(String selectedGame) {
        this.selectedGame = selectedGame;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }


    
    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private DefaultSelectItemsArray dropdown2DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown2DefaultItems() {
        return dropdown2DefaultItems;
    }

    public void setDropdown2DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown2DefaultItems = dsia;
    }

    

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public search() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
       //this.dropdown2DefaultItems.setItems(result);
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("search Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
     
    
    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String[] search_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.

        //String selectedItem=(this.dropdown1DefaultItems.get(selectedIndex));
        //GameAttributes game = new GameAttributes();
        MySqlConnection con = new MySqlConnection();
        String[] temp=new String[1];
        temp[0]="ErrorInSearch";
        if (getSearchCategory().equals("Game Tag"))
        {
            try
            {
                temp=con.getGameNamebyGameTag(this.getTextt());
            }
            catch (Exception e)
            {
                temp[0]="ErrorinSearchAction";
                //temp[1]=e.toString();
            }
        }
        else if (getSearchCategory().equals("Creator Name"))
        {
            try
            {
                //int id=con.getUserIdbyUserName(this.getTextt());
                temp=con.getGameNameByUserNameString(this.getTextt());
                //ResultSet rs=null;
            }
            catch (Exception e)
            {
                temp=new String[2];
                temp[0]="ErrorinSearchAction";
                temp[1]=e.toString();
            }
        }
        else if (getSearchCategory().equals("Maximum Number of Steps"))
        {
            try
            {
                //int id=con.getUserIdbyUserName(this.getTextt());
                temp=con.getGameNameByMaxSteps(Integer.parseInt(this.getTextt()));
                //ResultSet rs=null;
            }
            catch (Exception e)
            {
                temp=new String[2];
                temp[0]="ErrorinSearchAction";
                temp[1]=e.toString();
            }
        }
        else if (getSearchCategory().equals("Maximum Rating"))
        {
            try
            {
                //int id=con.getUserIdbyUserName(this.getTextt());
                temp=con.getGameNameByMaxRating(Integer.parseInt(this.getTextt()));
                //ResultSet rs=null;
            }
            catch (Exception e)
            {
                temp=new String[2];
                temp[0]="ErrorinSearchAction";
                temp[1]=e.toString();
            }
            // Iterator
        // This clip illustrates how to populate a text area
        // from an array of values by using an iterator
        // TODO: The page should have a multi-line text area
        // and a button.  This code goes in the button_action method

        
        }
        else
        {
            temp=new String[1];
            temp[0]="NotEntering elseIF";
        }
        //burda gamename e göre select from where like sorgusu yapılacak
        //server a bağlanamadığım için ben yapamadım
        
        return temp;
    }

    
    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.

        try
        {
            String[] temp=new String[1];
            temp[0]="temp";
            temp=search_action();
            //String[] temp=new String[1];
            //temp[0]="TexttEmpty";
            if(temp!=null)
                this.setsearchResults(temp);
            else
            {
                String[] t=new String[1];
                t[0]="SearchActionReturnNull";
                this.setsearchResults(t);
            }
        }
        catch (Exception e)
        {
            String[] t=new String[2];
            t[0]="SearchActionReturnEmpty";
            t[1]=e.toString();
            this.setsearchResults(t);
            //System.out.println(temp);
        }
        return null;
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.

        try{
            MySqlConnection con = new MySqlConnection();
            int gameId=con.getGameIdbyGameName(this.getSelectedGame());
            this.getSessionBean1().setSelectedGameId(gameId);
        }
        catch(Exception e){
            String[] t=new String[1];
            t[0]="yemedi";
            this.setsearchResults(t);
        }

        return "case1";
    }
    
}


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
import javax.faces.event.ValueChangeEvent;
import Classes.MySqlConnection;
import Classes.GameAttributes;
import java.util.*;
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

    public String[] getsearchResults() {
        return searchResults;
    }

    public void setsearchResults(String[] sR) {
        this.searchResults = sR.clone();
        this.dropdown2DefaultItems.setItems(sR);
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


    
    public String getGamename1() {
        return searchResults[0];
    }

    public String getGamename2() {
        return searchResults[1];
    }

    public String getGamename3() {
        return searchResults[2];
    }

    
public void setGamename1(String[] sR) {
        this.searchResults[0] = sR[0];
    }

    public void setGamename2(String[] sR) {
        this.searchResults[1] = sR[1];
    }

    public void setGamename3(String[] sR) {
        this.searchResults[2] = sR[2];
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
    
    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems() {
        return dropdown1DefaultItems;
    }

    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems = dsia;
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
        
       String[] menuItems={"Game Tag","Game Name","Maximum step number","Maximum Rating","Creator Name"};
       String[] result={"init"};
       this.dropdown1DefaultItems.setItems(menuItems);
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

        MySqlConnection con = new MySqlConnection();
        //GameAttributes game = new GameAttributes();
        String[] temp=new String[1];
        
        try
        {
            temp=con.getGameNamebyGameTag(this.searchString);
        }
        catch (Exception e)
        {
            temp[0]="ErrorinSearchAction";
        }

        //burda gamename e göre select from where like sorgusu yapılacak
        //server a bağlanamadığım için ben yapamadım
        
        return temp;
    }

    

    public void game_name_processValueChange(ValueChangeEvent event) {
    }

    public void button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        String[] temp=null;
        try
        {
            temp=search_action();
            setsearchResults(temp);
        }
        catch (Exception e)
        {
            String[] t=new String[1];
            t[0]="ErrorinButtonp1";
            setsearchResults(t);
            //System.out.println(temp);
        }
        /*String[] otherTemp=new String[temp.length];
        for(int i=0;i<temp.length;i++){
            otherTemp[i]=temp[i];
        }
        
        for(int i=0;i<this.searchResults.length;i++)
            this.dropdownDefaultItems.setItems(this.searchResults);
        */
        try    
        {
            setsearchResults(this.searchResults);
        }
        catch (Exception e)
        {
            String[] t=new String[1];
            t[0]="ErrorinButtonp2";
            setsearchResults(t);
            //System.out.println(searchResults[0]);
        }  
    }

    public void textField2_processValueChange(ValueChangeEvent event) {
    }

    public String hyperlink1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        try{
            MySqlConnection con = new MySqlConnection();
            if(con.gameExists(this.searchResults[0])){
                this.getSessionBean1().setSelectedGameId(con.getGameIdbyGameName(this.searchResults[0]));
           }
        }
        catch(Exception e)
        {
            System.out.println("Error, going to homepage");
        }
        return "case1";
    }

    public String hyperlink2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        try{
            MySqlConnection con = new MySqlConnection();
            this.getSessionBean1().setSelectedGameId(con.getGameIdbyGameName(this.searchResults[1]));
        }
        catch(Exception e){

        }
        return "case2";
    }
    public String hyperlink3_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        try{
            MySqlConnection con = new MySqlConnection();
            this.getSessionBean1().setSelectedGameId(con.getGameIdbyGameName(this.searchResults[2]));
        }
        catch(Exception e){

        }
        return "case3";
    }
    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }
    public void dropdown1_processValueChange(ValueChangeEvent vce) {
    }
}


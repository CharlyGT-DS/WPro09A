/*
 *  Copyright 2009-2022 PrimeTek.
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.primefaces.layout;

import EJB.DBaseLocal;
import PERFIL.CargaDocumentosLocal;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.primefaces.PrimeFaces;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;
import org.primefaces.layout.enums.InputStyleType;
import org.primefaces.layout.enums.LayoutType;
import org.primefaces.layout.enums.MenuType;
import org.primefaces.layout.enums.InlineMenuType;
import org.primefaces.layout.util.StyleClassBuilder;
import org.primefaces.model.menu.DefaultSubMenu;

@Named
@SessionScoped
public class App implements Serializable {

    /********** LAYOUT OPTIONS **********/

    private String topbarTheme = "blue";

    private String menuTheme = "light";

    private String componentTheme = "indigo";

    private LayoutType layoutMode = LayoutType.LIGHT;

    private MenuType menuMode = MenuType.STATIC;

    private InlineMenuType inlineMenuPosition = InlineMenuType.BOTTOM;

    private InputStyleType inputStyle = InputStyleType.FILLED;

    private boolean ripple = true;

    private boolean rtl = false;
    
    /************************************/
    
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    private String numeroEntrada="";
    
    private DBaseLocal api=null;
    
    private transient InitialContext ctx=null;
    
    private MenuModel model;
    
    private Map<String, String> menuItems;

    public String getNumeroEntrada() {
        return numeroEntrada;
    }

    /************************************/
    public void setNumeroEntrada(String numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    /** Theme and Layout */
    public String getTheme() {
        return this.componentTheme + (this.isDarkLayout() ? "-dark" : "");
    }

    public String getLayout() {
        return "layout-" + this.layoutMode.toString();
    }

    /** Layout Mode */
    public boolean isLightLayout() {
        return LayoutType.LIGHT.equals(this.layoutMode);
    }
    public boolean isDarkLayout() {
        return LayoutType.DARK.equals(this.layoutMode);
    }

    /** Menu Modes */
    public boolean isStaticMenu() {
        return MenuType.STATIC.equals(this.menuMode);
    }
    public boolean isOverlayMenu() {
        return MenuType.OVERLAY.equals(this.menuMode);
    }
    public boolean isHorizontalMenu() {
        return MenuType.HORIZONTAL.equals(this.menuMode);
    }
    public boolean isSlimMenu() {
        return MenuType.SLIM.equals(this.menuMode);
    }

    /** Inline Menu Positions */
    public boolean isTopInlineMenu() {
        return InlineMenuType.TOP.equals(this.inlineMenuPosition);
    }
    public boolean isBottomInlineMenu() {
        return InlineMenuType.BOTTOM.equals(this.inlineMenuPosition);
    }
    public boolean isBothInlineMenu() {
        return InlineMenuType.BOTH.equals(this.inlineMenuPosition);
    }

    /** InputStyle Modes */
    public boolean isFilledInputStyle() {
        return InputStyleType.FILLED.equals(this.inputStyle);
    }
    public boolean isOutlinedInputStyle() {
        return InputStyleType.OUTLINED.equals(this.inputStyle);
    }

    /** Layout Classes */
    public String getBodyClass() {
        return new StyleClassBuilder()
            .add(this.isFilledInputStyle(), "ui-input-filled")
            .add(!this.ripple, "ui-ripple-disabled")
            .build();
    }

    public String getLayoutClass() {
        return new StyleClassBuilder()
            .add(this.isStaticMenu(), "layout-menu-static")
            .add(this.isOverlayMenu(), "layout-menu-overlay")
            .add(this.isHorizontalMenu(), "layout-menu-horizontal")
            .add(this.isSlimMenu(), "layout-menu-slim")
            .add(this.rtl, "layout-rtl")
            .add(this.menuTheme != null, "layout-menu-" + this.menuTheme)
            .add(this.topbarTheme != null, "layout-topbar-" + this.topbarTheme)
            .build();
    }

    /** App Logo */
    public boolean isLogoLight() {
        switch(this.topbarTheme) {
            case "white":
            case "yellow":
            case "amber":
            case "orange":
            case "lime":
                return false;
            default:
                return true;
        }
    }

    /** App BreadCrumb */
    public MenuModel getBreadCrumbModel() {
        Map<String, Object> params = FacesContext.getCurrentInstance().getExternalContext().getRequestMap();
        Object homeOutcome = params.get("homeOutcome");
        Object value = params.get("value");
        Object outcome = params.get("outcome");

        MenuModel model = new DefaultMenuModel();

        DefaultMenuItem item = new DefaultMenuItem();
        item.setIcon("pi pi-home");
        if (homeOutcome != null) item.setOutcome(String.valueOf(homeOutcome));

        model.getElements().add(item);

        if (value != null) {
            String[] parts = String.valueOf(value).split(",");

            for(int i = 0; i < parts.length; i++) {
                DefaultMenuItem pageItem = new DefaultMenuItem();

                pageItem.setValue(parts[i]);
                if (outcome != null && i == (parts.length - 1)) pageItem.setOutcome(String.valueOf(outcome));

                model.getElements().add(pageItem);
            }
        }

        return model;
    }

    /******* Getter and Setters ******/
    public void setComponentTheme(String componentTheme) {
        this.componentTheme = componentTheme;
    }

    public String getComponentTheme() {
        return this.componentTheme;
    }

    public void setTopbarTheme(String topbarTheme) {
        this.topbarTheme = topbarTheme;
    }

    public String getTopbarTheme() {
        return this.topbarTheme;
    }

    public void setMenuTheme(String menuTheme) {
	this.menuTheme = menuTheme;
    }

    public String getMenuTheme() {
	return this.menuTheme;
    }

    public void setLayoutMode(LayoutType layoutMode) {
        this.layoutMode = layoutMode;

        if (isDarkLayout()) {
            this.menuTheme = "dark";
            this.topbarTheme = "dark";
        }
        else {
            this.menuTheme = "light";
            this.topbarTheme = "blue";
        }
    }

    public LayoutType getLayoutMode() {
        return this.layoutMode;
    }

    public void setMenuMode(MenuType menuMode) {
        this.menuMode = menuMode;
    }

    public MenuType getMenuMode() {
        return this.menuMode;
    }

    public void setInlineMenuPosition(InlineMenuType inlineMenuPosition) {
        this.inlineMenuPosition = inlineMenuPosition;
    }

    public InlineMenuType getInlineMenuPosition() {
        return this.inlineMenuPosition;
    }

    public void setInputStyle(InputStyleType inputStyle) {
        this.inputStyle= inputStyle;
    }

    public InputStyleType getInputStyle() {
        return this.inputStyle;
    }

    public void setRipple(boolean ripple) {
        this.ripple = ripple;
    }

    public boolean isRipple() {
        return this.ripple;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }

    public boolean isRtl() {
        return this.rtl;
    }
    
 
    // agrega menu principal dependiendo el perfil del usario
    public void cargaMenu(String idUsuario){
        
        try {
            this.ctx = new InitialContext();
            this.api =  (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
            String sql = UTILIDADES.SQL.obtieneMenuPrincipalPorIdUsuario(idUsuario);
            System.out.println("**** "+sql+ " *****");
            
            List<java.util.LinkedHashMap> items = (List<java.util.LinkedHashMap>) this.api.convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
            this.model = new DefaultMenuModel();
            
            System.out.println("tamaño :"+items.size());
            
            // Crear un submenu
            DefaultSubMenu submenu = DefaultSubMenu.builder()
                .label("Principal")
                .icon("pi pi-bars")
                .build();
            
            // Agregar dinámicamente los ítems del HashMap
        for (java.util.LinkedHashMap t : items) {
            
            DefaultMenuItem item = DefaultMenuItem.builder()
                    .value(t.get("nombre").toString()) // nombre visible
                    .url(t.get("valor").toString()) // navegación a la URL
                    .icon(t.get("icono").toString()) // icono opcional
                    .styleClass("green-panelmenu-item")
                    .build();
            System.out.println("valor :"+t.get("nombre"));
            submenu.getElements().add(item);
            
        }

        this.model.getElements().add(submenu);
            
            this.numeroEntrada =  String.valueOf(this.cargaDoc.ejecutarCadaMinuto());
            
            PrimeFaces.current().ajax().update(":layoutMenuForm:dat");
            PrimeFaces.current().ajax().update(":form:num");
            
           
            
            
        } catch (NamingException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }// fin de agrega menu
    
    public void cargarNumeros(){
                    this.numeroEntrada =  String.valueOf(this.cargaDoc.ejecutarCadaMinuto());
                    PrimeFaces.current().ajax().update(":form:num");
                    
    }
    
    public MenuModel getModel() {
        return this.model;
    }
    
   
}
package uia.pdf.grid.layout;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for GridType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GridType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columns">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="column" type="{http://grid.pdf.uia/layout}ColumnType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" default="13" />
 *                 &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="background" type="{http://www.w3.org/2001/XMLSchema}string" default="212,212,212" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}int" default="9" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridType", propOrder = {
        "columns"
})
public class GridType {

    @XmlElement(required = true)
    protected GridType.Columns columns;

    @XmlAttribute(required = true)
    protected String name;

    @XmlAttribute
    protected Integer fontSize;

    /**
     * Gets the value of the columns property.
     *
     * @return
     *     possible object is
     *     {@link GridType.Columns }
     *
     */
    public GridType.Columns getColumns() {
        return this.columns;
    }

    /**
     * Sets the value of the columns property.
     *
     * @param value
     *     allowed object is
     *     {@link GridType.Columns }
     *
     */
    public void setColumns(GridType.Columns value) {
        this.columns = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fontSize property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getFontSize() {
        if (this.fontSize == null) {
            return 9;
        }
        else {
            return this.fontSize;
        }
    }

    /**
     * Sets the value of the fontSize property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="column" type="{http://grid.pdf.uia/layout}ColumnType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" default="13" />
     *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="background" type="{http://www.w3.org/2001/XMLSchema}string" default="212,212,212" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "column"
    })
    public static class Columns {

        @XmlElement(required = true)
        protected List<ColumnType> column;

        @XmlAttribute
        protected Integer height;

        @XmlAttribute
        protected Integer fontSize;

        @XmlAttribute
        protected String background;

        /**
         * Gets the value of the column property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the column property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColumn().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ColumnType }
         *
         *
         */
        public List<ColumnType> getColumn() {
            if (this.column == null) {
                this.column = new ArrayList<ColumnType>();
            }
            return this.column;
        }

        /**
         * Gets the value of the height property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public int getHeight() {
            if (this.height == null) {
                return 13;
            }
            else {
                return this.height;
            }
        }

        /**
         * Sets the value of the height property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setHeight(Integer value) {
            this.height = value;
        }

        /**
         * Gets the value of the fontSize property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * Sets the value of the fontSize property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setFontSize(Integer value) {
            this.fontSize = value;
        }

        /**
         * Gets the value of the background property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBackground() {
            if (this.background == null) {
                return "212,212,212";
            }
            else {
                return this.background;
            }
        }

        /**
         * Sets the value of the background property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBackground(String value) {
            this.background = value;
        }

    }

}

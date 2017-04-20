package no.stelar7.api.l4j8.pojo.staticdata.rune;

import no.stelar7.api.l4j8.pojo.staticdata.shared.*;

import java.util.*;

public class StaticRuneList
{
    private BasicData               basic;
    private Map<String, StaticRune> data;
    
    
    
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final StaticRuneList other = (StaticRuneList) obj;
        if (this.basic == null)
        {
            if (other.basic != null)
            {
                return false;
            }
        } else if (!this.basic.equals(other.basic))
        {
            return false;
        }
        if (this.data == null)
        {
            if (other.data != null)
            {
                return false;
            }
        } else if (!this.data.equals(other.data))
        {
            return false;
        }
        
        return true;
    }
    
    /**
     * Gets the basic.
     *
     * @return the basic
     */
    public BasicData getBasic()
    {
        return this.basic;
    }
    
    /**
     * Gets the data.
     *
     * @return the data
     */
    public Map<String, StaticRune> getData()
    {
        return this.data;
    }
    
    @Override
    public int hashCode()
    {
        final int prime  = 31;
        int       result = 1;
        result = (prime * result) + ((this.basic == null) ? 0 : this.basic.hashCode());
        result = (prime * result) + ((this.data == null) ? 0 : this.data.hashCode());
        result = (prime * result) + super.hashCode();
        return result;
    }
    
    @Override
    public String toString()
    {
        return "StaticRuneList{" +
               "basic=" + basic +
               ", data=" + data +
               '}';
    }
}
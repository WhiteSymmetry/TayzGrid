/*
 * @(#)TypeSurrogateSelector.java	1.0
 *
 * Created on September 18, 2008, 12:59 PM
 *
 * Copyright 2008 NeXtreme Innovations, Inc. All rights reserved.
 * "NeXtreme Innovations" PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */

package com.alachisoft.tayzgrid.serialization.core.io;

import com.alachisoft.tayzgrid.serialization.core.io.surrogates.CacheArgumentException;
import com.alachisoft.tayzgrid.serialization.core.io.surrogates.SerializationSurrogate;

/**
 * TypeSurrogateSelector class.
 *
 * @version 1.0, September 18, 2008
 */
public interface TypeSurrogateSelector
{
    /*
     * Returns the default type surrogate selector object
    */
    public SerializationSurrogate getNullSurrogate();

    /*
     * Returns the default type surrogate selector object
    */
    public void setNullSurrogate(SerializationSurrogate value);

    /*
     * Returns the default type surrogate selector object
    */
    public SerializationSurrogate getDefaultSurrogate();

    /*
     * Returns the default type surrogate selector object
    */
    public void setDefaultSurrogate(SerializationSurrogate value);
    
    /**
     * Use this to determine whether the specified surrogate is a built-in surrogate
     * @return true if the specified surrogate is a built-in surrogate
     */
    public boolean isBuiltinSurrogate(SerializationSurrogate surrogate);
    
    /**
     * Finds and returns an appropriate <tt>SerializationSurrogate</tt> for the given
     * Object. If no surrogate is found for the specified object, the <tt>Default"<tt/>
     * surrogate is returned.
     *
     * @param graph the Object whose surrogate is to be found.
     * @return an <tt>SerializationSurrogate</tt> Object
     * @see SerializationSurrogate
     */
    public SerializationSurrogate getSurrogateForObject(Object graph, String cacheContext);

    /**
     * Finds and returns an appropriate <tt>SerializationSurrogate</tt> for the given
     * type. If no surrogate is found for the specified type, the <tt>Default"<tt/>
     * surrogate is returned.
     *
     * @param type the Class whose surrogate is to be found.
     * @return an <tt>SerializationSurrogate</tt> Object
     * @see SerializationSurrogate
     */
    public SerializationSurrogate getSurrogateForType(Class type, String cacheContext);

    /**
     * Finds and returns an appropriate <tt>SerializationSurrogate</tt> for the given
     * Object. Allows you to inhibit the usage of default surrogate. If no surrogate is 
     * found for the specified object and strict is false, the <tt>Default"<tt/> surrogate 
     * is returned.
     *
     * @param type the Class whose surrogate is to be found.
     * @param strict specified whether the default surrogate will be returned in case of
     * no match.
     * @return an <tt>SerializationSurrogate</tt> Object if a match is found, otherwise
     * retursn null or the default surrogate depending upon the value of "strict".
     * @see SerializationSurrogate
     */
    public SerializationSurrogate getSurrogateForType(Class type, boolean strict, String cacheContext);

    /**
     * Finds and returns an appropriate <tt>SerializationSurrogate</tt> for the given
     * type handle. If no surrogate is found for the specified object, the <tt>Default"<tt/> surrogate 
     * is returned.
     *
     * @param handle the handle of the surrogate that is to be returned.
     * @return an <tt>SerializationSurrogate</tt> Object if a match is found, otherwise
     * retursn the default surrogate.
     * @see SerializationSurrogate
     */
    public SerializationSurrogate getSurrogateForTypeHandle(short handle, String cacheContext);

    public SerializationSurrogate GetSurrogateForSubTypeHandle(short handle, short subHandle, String cacheContext);
    
    /**
     * Registers the specified <tt>SerializationSurrogate<tt/> with the system.
     *
     * @param surrogate specified surrogate
     * @return false if the surrogated type already has a surrogate
     */
    public boolean register(SerializationSurrogate surrogate)
        throws CacheArgumentException;

    /**
     * Registers the specified <tt>SerializationSurrogate<tt/> with the given type handle.
     * Gives more control over the way type handles are generated by the system and allows the 
     * user to supply *HARD* handles for better interoperability among applications.
     *
     * @param surrogate specified surrogate
     * @param typeHandle specified HARD handle for type. <code>typeHandle<code/> must be in the 
     * range <code>TypeSurrogateSelector.MinTypeHandle<code/> and <code> TypeSurrogateSelector.MaxTypeHandle<code/> (inclusive)
     * @return false if the surrogated type already has a surrogate
     */
    public boolean register(SerializationSurrogate surrogate, short typeHandle)
        throws CacheArgumentException;

        /**
     * Registers the specified <tt>SerializationSurrogate<tt/> with the given type handle.
     * Gives more control over the way type handles are generated by the system and allows the
     * user to supply *HARD* handles for better interoperability among applications.
     *
     * @param surrogate specified surrogate
     * @param typeHandle specified HARD handle for type. <code>typeHandle<code/> must be in the
     * range <code>TypeSurrogateSelector.MinTypeHandle<code/> and <code> TypeSurrogateSelector.MaxTypeHandle<code/> (inclusive)
     * @return false if the surrogated type already has a surrogate
     */
    public boolean register(SerializationSurrogate surrogate, short typeHandle,short subHandle, String cacheContext, boolean portable) throws CacheArgumentException;


    /**
     * Unregisters the specified <tt>SerializationSurrogate<tt/> from the system.
     *
     * @param surrogate specified surrogate
     */
    public void unregister(SerializationSurrogate surrogate, String cacheContext, boolean removeCache);

    /** 
     * Unregisters all surrogates, except null and default ones.
     */
    public void clear();
}

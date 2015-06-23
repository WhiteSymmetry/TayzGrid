/*
 * @(#)GenericArraySerializationSurrogate.java	1.0
 *
 * Created on September 18, 2008, 12:59 PM
 *
 * Copyright 2008 NeXtreme Innovations, Inc. All rights reserved.
 * "NeXtreme Innovations" PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.alachisoft.tayzgrid.serialization.standard.io.surrogates;

import com.alachisoft.tayzgrid.serialization.core.io.CacheObjectInput;
import com.alachisoft.tayzgrid.serialization.core.io.CacheObjectOutput;
import com.alachisoft.tayzgrid.serialization.core.io.surrogates.BuiltinSerializationSurrogate;
import com.alachisoft.tayzgrid.serialization.core.io.surrogates.CacheIOException;
import com.alachisoft.tayzgrid.serialization.core.io.surrogates.CacheInstantiationException;
import com.alachisoft.tayzgrid.serialization.core.io.surrogates.SerializationSurrogateImpl;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 * GenericArraySerializationSurrogate is responsible for writing and reading
 * instances of array types.
 *
 * @version 1.0, September 18, 2008
 */
public class GenericArraySerializationSurrogate<T>
        extends SerializationSurrogateImpl
        implements BuiltinSerializationSurrogate
{

    private Class mItemType;

    /** Creates a new instance of GenericArraySerializationSurrogate */
    public GenericArraySerializationSurrogate(Class<T[]> type)
    {
        super(type);
        mItemType = this.getRealClass().getComponentType();
    }

    /**
     * Creates instance of type returned by getRealClass(). This is different from NxSerializationSurrogateBase.createTypeInstance() 
     * in the sense that an NCacheObjectInput object is passed as parameter that can be used to read creation specific
     * information from the stream. For example it can be used to read the length of the array before actually 
     * reading the values.
     * 
     * The default implementation simply delegates to super.createTypeInstance().
     *
     * @param input stream reader
     * @throws CacheInstantiationException Object creation related exceptions.
     * @return Object that this surrogate must deserialize
     */
    @Override
    public Object instantiate(CacheObjectInput input)
            throws CacheInstantiationException
    {
        try
        {
            int length = input.readInt();
            return Array.newInstance(mItemType, length);
        }
        catch (IOException ex)
        {
            throw new CacheInstantiationException(ex);
        }
    }

    /**
     * Read an object of type returned by getRealClass() from the stream reader. 
     * A fresh instance of the object is passed as parameter.
     * The surrogate should populate fields in the object from data on the stream
     * 
     * @param input stream reader
     * @param graph a fresh instance of the object that the surrogate must deserialize.
     * @throws CacheInstantiationException Object creation related exceptions.
     * @throws CacheIOException Any of the usual Input/Output related exceptions.
     * @return object read from the stream reader
     */
    public Object readDirect(CacheObjectInput input, Object graph)
            throws CacheInstantiationException, CacheIOException
    {
        try
        {
            T[] array = (T[]) graph;
            int len = array.length;
            for (int i = 0; i < len; i++)
            {
                array[i] = (T) input.readObject();
            }
            return array;
        }
        catch (ClassNotFoundException ex)
        {
            throw new CacheIOException(ex);
        }
        catch (IOException ex)
        {
            throw new CacheIOException(ex);
        }
    }

    /**
     * Write an object of type returned by getRealClass() to the stream writer
     *
     * @param output stream writer
     * @param graph object to be written to the stream reader
     * @throws CacheIOException Any of the usual Input/Output related exceptions.
     */
    public void writeDirect(CacheObjectOutput output, Object graph)
            throws CacheIOException
    {
        try
        {
            T[] array = (T[]) graph;
            int len = array.length;
            output.writeInt(len);
            for (int i = 0; i < len; i++)
            {
                output.writeObject(array[i]);
            }
        }
        catch (IOException ex)
        {
            throw new CacheIOException(ex);
        }
    }

    @Override
    public void skipDirect(CacheObjectInput input, Object graph) throws CacheInstantiationException, CacheIOException
    {
        try
        {
            T[] array = (T[]) graph;
            int len = array.length;
            for (int i = 0; i < len; i++)
            {
                input.skipObject();
            }
        }
        catch (IOException ex)
        {
            throw new CacheIOException(ex);
        }
    }
}

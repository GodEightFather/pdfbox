/**
 * Copyright (c) 2006, www.jempbox.org
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 3. Neither the name of pdfbox; nor the names of its
 *    contributors may be used to endorse or promote products derived from this
 *    software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * http://www.jempbox.org
 *
 */
package org.jempbox.xmp.pdfa;

import org.jempbox.xmp.XMPMetadata;
import org.jempbox.xmp.XMPSchema;
import org.w3c.dom.Element;

/**
 * Define XMP properties used PDFA extension schema description schemas.
 * TODO 2 naked so far, implement
 * 
 * @author Karsten Krieg (kkrieg@intarsys.de)
 * @version $Revision: 1.1 $
 */
public class XMPSchemaPDFAId extends XMPSchema
{
    /**
     * The namespace for this schema.
     * This is the future amendment of the PDFA Spec with the trailing slash at end
     */    
    public static final String NAMESPACE = "http://www.aiim.org/pdfa/ns/id/";
    
    /**
     * Construct a new blank PDFA schema.
     *
     * @param parent The parent metadata schema that this will be part of.
     */
    public XMPSchemaPDFAId( XMPMetadata parent )
    {
        super( parent, "pdfaType", NAMESPACE );
    }
    
    /**
     * Constructor from existing XML element.
     * 
     * @param element The existing element.
     * @param prefix The schema prefix.
     */
    public XMPSchemaPDFAId( Element element , String prefix)
    {
        super( element , prefix);
    }   
    
    /**
     * Get the ISO19005 part number.
     * 
     * @return The ISO 19005 part number.
     */
    public Integer getPart()
    {
        return getIntegerProperty( prefix+":part" );
    }
    
    /**
     * Set the ISO19005 part number.
     * 
     * @param part The ISO 19005 part number.
     */
    public void setPart( Integer part )
    {
        setIntegerProperty( prefix+":part", part);
    }
    
    /**
     * Set the amendment idenitifier.
     *
     * @param amd The amendment idenitifier.
     */
    public void setAmd( String amd )
    {
        setTextProperty( prefix+":amd", amd);
    }
    
    /**
     * Get the amendment idenitifier.
     *
     * @return The amendment idenitifier.
     */
    public String getAmd()
    {
        return getTextProperty( prefix+":amd" );
    }

    /**
     * Set the conformance level.
     *
     * @param conformance The conformance level.
     */
    public void setConformance( String conformance )
    {
        setTextProperty( prefix+":conformance", conformance);
    }
    
    /**
     * Get the conformance level.
     *
     * @return The conformance level.
     */
    public String getConformance()
    {
        return getTextProperty( prefix+":conformance" );
    }

}
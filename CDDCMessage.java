////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) since 1999. VASCO DATA SECURITY
// All rights reserved. http://www.vasco.com
//
////////////////////////////////////////////////////////////////////////////////

package com.vasco.orchestration.client.cddc;

public class CDDCMessage {

    /**
     * the CDDC Return Code
     *
     */
    private int returnCode;

    /**
     * JSON string containing the CDDC message
     *
     */
    private String cddcMessage;

    /**
     * Boolean
     *
     */
    private boolean isNew;

    public CDDCMessage(String message, int returnCode, boolean isNew) {
        this.cddcMessage = message;
        this.returnCode = returnCode;
	this.isNew = isNew;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public String getCddcMessage() {
        return cddcMessage;
    }


}

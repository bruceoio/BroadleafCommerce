/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadleafcommerce.vendor.cybersource.service;

import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourcePaymentRequest;
import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourcePaymentResponse;
import org.broadleafcommerce.vendor.service.exception.PaymentException;
import org.broadleafcommerce.vendor.service.type.ServiceStatusType;

public interface CyberSourcePaymentService {

    public CyberSourcePaymentResponse authorize(CyberSourcePaymentRequest request) throws PaymentException;
    
    public CyberSourcePaymentResponse reverseAuthorize(CyberSourcePaymentRequest request) throws PaymentException;
    
    public CyberSourcePaymentResponse capture(CyberSourcePaymentRequest request) throws PaymentException;
    
    public CyberSourcePaymentResponse credit(CyberSourcePaymentRequest request) throws PaymentException;
    
    public CyberSourcePaymentResponse voidTransaction(CyberSourcePaymentRequest request) throws PaymentException;

    public ServiceStatusType getServiceStatus();

    public Integer getFailureReportingThreshold();

    public void setFailureReportingThreshold(Integer failureReportingThreshold);

    public String getServiceName();

    public String getMerchantId();
    
    public void setMerchantId(String merchantId);
    
    public String getTransactionKey();
    
    public void setTransactionKey(String transactionKey);
    
    public String getServerUrl();
    
    public void setServerUrl(String serverUrl);
    
}
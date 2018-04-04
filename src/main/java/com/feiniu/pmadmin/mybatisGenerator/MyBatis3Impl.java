/*
 * feiniu.com Inc.
 * Copyright (c) 2013-2018. All Rights Reserved.
 */
package com.feiniu.pmadmin.mybatisGenerator;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;

import java.text.MessageFormat;

/**
 * <B>Description:</B> <br>
 * <B>Create on:</B> 2017年4月13日 上午11:14:40<br>
 *
 * @author yajun.he
 * @version 1.0
 */
public class MyBatis3Impl extends IntrospectedTableMyBatis3Impl {

	@Override
    protected String calculateMyBatis3XmlMapperFileName() {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotEmpty(tableConfiguration.getDomainObjectName())) {
        	String domainObjectName = tableConfiguration.getDomainObjectName();
        	String xmlName = domainObjectName.replace("Entity", "");
        	sb.append(xmlName);
            sb.append(".mapper.xml"); 
        } else {
            sb.append(fullyQualifiedTable.getDomainObjectName());
            sb.append("Mapper.xml"); //$NON-NLS-1$
        }
        return sb.toString();
    }

    @Override
    protected void calculateJavaClientAttributes() {
        if (context.getJavaClientGeneratorConfiguration() == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(calculateJavaClientImplementationPackage());
        sb.append('.');
        sb.append(fullyQualifiedTable.getDomainObjectName());
        sb.append("DAOImpl"); //$NON-NLS-1$
        setDAOImplementationType(sb.toString());

        sb.setLength(0);
        sb.append(calculateJavaClientInterfacePackage());
        sb.append('.');
        sb.append(fullyQualifiedTable.getDomainObjectName());
        sb.append("DAO"); //$NON-NLS-1$
        setDAOInterfaceType(sb.toString());

        sb.setLength(0);
        sb.append(calculateJavaClientInterfacePackage());
        sb.append('.');
        if (StringUtils.isNotEmpty(tableConfiguration.getDomainObjectName())) {
        	String domainObjectName = tableConfiguration.getDomainObjectName();
        	String mapperName = domainObjectName.replace("Entity", "Dao");
        	sb.append("I");
        	sb.append(mapperName);
        } else {
            sb.append(fullyQualifiedTable.getDomainObjectName());
            sb.append("Mapper"); //$NON-NLS-1$
        }
        setMyBatis3JavaMapperType(sb.toString());

        sb.setLength(0);
        sb.append(calculateJavaClientInterfacePackage());
        sb.append('.');
        if (StringUtils.isNotEmpty(tableConfiguration.getSqlProviderName())) {
            //支持mapperName = "{0}SqlProvider" 等用法
            sb.append(MessageFormat.format(tableConfiguration.getSqlProviderName(), fullyQualifiedTable.getDomainObjectName()));
        } else {
            sb.append(fullyQualifiedTable.getDomainObjectName());
            sb.append("SqlProvider"); //$NON-NLS-1$
        }
        setMyBatis3SqlProviderType(sb.toString());
    }
}

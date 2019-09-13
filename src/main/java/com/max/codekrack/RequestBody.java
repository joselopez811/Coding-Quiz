package com.max.codekrack;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestBody {
    @XmlElement String question;
    @XmlElement String code;
    @XmlElement Integer answer;
    @XmlElement List<String> answers;
}

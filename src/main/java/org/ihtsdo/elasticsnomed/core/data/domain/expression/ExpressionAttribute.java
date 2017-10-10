package org.ihtsdo.elasticsnomed.core.data.domain.expression;

import org.ihtsdo.elasticsnomed.core.data.domain.ConceptMicro;
import org.ihtsdo.elasticsnomed.core.data.domain.ConceptMini;

public class ExpressionAttribute {

	private final ConceptMicro type;
	private final ConceptMicro value;
	
	public ExpressionAttribute(ConceptMini type, ConceptMini target) {
		this.type = new ConceptMicro(type);
		this.value = new ConceptMicro(target);
	}

	public ExpressionAttribute(ConceptMicro type, ConceptMicro value) {
		this.type = type;
		this.value = value;
	}

	public ConceptMicro getType() {
		return type;
	}

	public ConceptMicro getValue() {
		return value;
	}

}

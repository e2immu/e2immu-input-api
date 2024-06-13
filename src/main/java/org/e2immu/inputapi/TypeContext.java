package org.e2immu.inputapi;

import org.e2immu.cstapi.type.TypeParameter;

public interface TypeContext {
    void addToContext(TypeParameter typeParameter);

    TypeContext newTypeContext();

    TypeMap typeMap();
}

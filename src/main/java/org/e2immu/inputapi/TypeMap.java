package org.e2immu.inputapi;

import org.e2immu.cstapi.info.TypeInfo;

public interface TypeMap {
    void addToByteCodeQueue(String fqn);

    TypeInfo addToTrie(TypeInfo subType);

    InspectionAndState typeInspectionSituation(String fqn);

    record InspectionAndState(TypeInfo typeInfo, InspectionState state) {
    }

}

package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public interface StateObject {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static StateRecord mergeRecords(StateObject stateObject, StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
            StateRecord a8;
            a8 = c.a(stateObject, stateRecord, stateRecord2, stateRecord3);
            return a8;
        }
    }

    StateRecord getFirstStateRecord();

    StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3);

    void prependStateRecord(StateRecord stateRecord);
}

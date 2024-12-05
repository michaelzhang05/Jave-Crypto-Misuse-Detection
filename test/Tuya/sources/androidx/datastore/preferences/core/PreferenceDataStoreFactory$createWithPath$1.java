package androidx.datastore.preferences.core;

import P6.Q;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class PreferenceDataStoreFactory$createWithPath$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Function0 $produceFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$createWithPath$1(Function0 function0) {
        super(0);
        this.$produceFile = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        return ((Q) this.$produceFile.invoke()).m();
    }
}

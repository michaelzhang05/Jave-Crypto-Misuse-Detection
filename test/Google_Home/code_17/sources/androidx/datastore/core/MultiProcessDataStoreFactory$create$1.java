package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;

/* loaded from: classes3.dex */
final class MultiProcessDataStoreFactory$create$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ M $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessDataStoreFactory$create$1(M m8) {
        super(1);
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterProcessCoordinator invoke(File it) {
        AbstractC3255y.i(it, "it");
        return new MultiProcessCoordinator(this.$scope.getCoroutineContext(), it);
    }
}

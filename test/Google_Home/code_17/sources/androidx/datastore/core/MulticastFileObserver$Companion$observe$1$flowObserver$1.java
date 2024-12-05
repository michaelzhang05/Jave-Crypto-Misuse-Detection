package androidx.datastore.core;

import O5.I;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import n6.k;
import n6.s;

/* loaded from: classes3.dex */
final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ s $$this$channelFlow;
    final /* synthetic */ File $file;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, s sVar) {
        super(1);
        this.$file = file;
        this.$$this$channelFlow = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.f8278a;
    }

    public final void invoke(String str) {
        if (AbstractC3255y.d(str, this.$file.getName())) {
            k.b(this.$$this$channelFlow, I.f8278a);
        }
    }
}

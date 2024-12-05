package androidx.navigation;

import O5.I;
import P5.AbstractC1378t;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$executeRestoreState$3 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Bundle $args;
    final /* synthetic */ List<NavBackStackEntry> $entries;
    final /* synthetic */ Q $lastNavigatedIndex;
    final /* synthetic */ O $navigated;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executeRestoreState$3(O o8, List<NavBackStackEntry> list, Q q8, NavController navController, Bundle bundle) {
        super(1);
        this.$navigated = o8;
        this.$entries = list;
        this.$lastNavigatedIndex = q8;
        this.this$0 = navController;
        this.$args = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return I.f8278a;
    }

    public final void invoke(NavBackStackEntry entry) {
        List<NavBackStackEntry> m8;
        AbstractC3255y.i(entry, "entry");
        this.$navigated.f34158a = true;
        int indexOf = this.$entries.indexOf(entry);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            m8 = this.$entries.subList(this.$lastNavigatedIndex.f34160a, i8);
            this.$lastNavigatedIndex.f34160a = i8;
        } else {
            m8 = AbstractC1378t.m();
        }
        this.this$0.addEntryToBackStack(entry.getDestination(), this.$args, entry, m8);
    }
}

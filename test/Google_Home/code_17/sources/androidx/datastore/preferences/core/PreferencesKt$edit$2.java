package androidx.datastore.preferences.core;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PreferencesKt$edit$2 extends l implements InterfaceC1668n {
    final /* synthetic */ InterfaceC1668n $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(InterfaceC1668n interfaceC1668n, d dVar) {
        super(2, dVar);
        this.$transform = interfaceC1668n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, dVar);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(Preferences preferences, d dVar) {
        return ((PreferencesKt$edit$2) create(preferences, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                t.b(obj);
                return mutablePreferences;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
        InterfaceC1668n interfaceC1668n = this.$transform;
        this.L$0 = mutablePreferences2;
        this.label = 1;
        if (interfaceC1668n.invoke(mutablePreferences2, this) == e8) {
            return e8;
        }
        return mutablePreferences2;
    }
}

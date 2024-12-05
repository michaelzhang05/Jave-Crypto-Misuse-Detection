package androidx.datastore.preferences.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;

@f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PreferenceDataStore$updateData$2 extends l implements n {
    final /* synthetic */ n $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStore$updateData$2(n nVar, d dVar) {
        super(2, dVar);
        this.$transform = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, dVar);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // X5.n
    public final Object invoke(Preferences preferences, d dVar) {
        return ((PreferenceDataStore$updateData$2) create(preferences, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Preferences preferences = (Preferences) this.L$0;
            n nVar = this.$transform;
            this.label = 1;
            obj = nVar.invoke(preferences, this);
            if (obj == e8) {
                return e8;
            }
        }
        Preferences preferences2 = (Preferences) obj;
        AbstractC3159y.g(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((MutablePreferences) preferences2).freeze$datastore_preferences_core();
        return preferences2;
    }
}

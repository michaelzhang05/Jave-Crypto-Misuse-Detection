package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l extends p {

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<Api.Client> f10637g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zaak f10638h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zaak zaakVar, ArrayList<Api.Client> arrayList) {
        super(zaakVar, null);
        this.f10638h = zaakVar;
        this.f10637g = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void a() {
        zabe zabeVar;
        Set<Scope> n;
        IAccountAccessor iAccountAccessor;
        zabe zabeVar2;
        zabeVar = this.f10638h.a;
        zaaw zaawVar = zabeVar.s;
        n = this.f10638h.n();
        zaawVar.q = n;
        ArrayList<Api.Client> arrayList = this.f10637g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Api.Client client = arrayList.get(i2);
            i2++;
            iAccountAccessor = this.f10638h.o;
            zabeVar2 = this.f10638h.a;
            client.getRemoteService(iAccountAccessor, zabeVar2.s.q);
        }
    }
}

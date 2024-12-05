package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzamo extends zzamq {

    /* renamed from: f, reason: collision with root package name */
    private static final zzapb f12812f = new zzapb();

    /* renamed from: g, reason: collision with root package name */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f12813g;

    private final <NetworkExtrasT extends com.google.ads.mediation.e, ServerParametersT extends MediationServerParameters> zzams I7(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzamo.class.getClassLoader());
            if (com.google.ads.mediation.b.class.isAssignableFrom(cls)) {
                com.google.ads.mediation.b bVar = (com.google.ads.mediation.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new zzant(bVar, (com.google.ads.mediation.e) this.f12813g.get(bVar.getAdditionalParametersType()));
            }
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzanl((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (Adapter.class.isAssignableFrom(cls)) {
                return new zzanl((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(" (not a valid adapter).");
            zzbad.i(sb.toString());
            throw new RemoteException();
        } catch (Throwable unused) {
            return J7(str);
        }
    }

    private final zzams J7(String str) throws RemoteException {
        try {
            zzbad.e("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            zzbad.d(sb.toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new zzanl(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new zzanl(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new zzanl(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new zzant(customEventAdapter, (CustomEventExtras) this.f12813g.get(customEventAdapter.getAdditionalParametersType()));
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final zzams D6(String str) throws RemoteException {
        return I7(str);
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final zzaov F2(String str) throws RemoteException {
        return zzapb.a(str);
    }

    public final void K7(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f12813g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final boolean m7(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzamo.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            zzbad.i(sb.toString());
            return false;
        }
    }
}

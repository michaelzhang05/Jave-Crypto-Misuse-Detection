package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzdo extends zzr implements zzdn {
    public zzdo() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdn C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzdn) {
            return (zzdn) queryLocalInterface;
        }
        return new zzdp(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzr
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzdq zzdsVar;
        zzdq zzdqVar;
        zzdq zzdqVar2 = null;
        zzdq zzdqVar3 = null;
        zzdt zzdtVar = null;
        zzdt zzdtVar2 = null;
        zzdt zzdtVar3 = null;
        zzdq zzdqVar4 = null;
        zzdq zzdqVar5 = null;
        zzdq zzdqVar6 = null;
        zzdq zzdqVar7 = null;
        zzdq zzdqVar8 = null;
        zzdq zzdqVar9 = null;
        zzdw zzdwVar = null;
        zzdq zzdqVar10 = null;
        zzdq zzdqVar11 = null;
        zzdq zzdqVar12 = null;
        zzdq zzdqVar13 = null;
        switch (i2) {
            case 1:
                i3(IObjectWrapper.Stub.C(parcel.readStrongBinder()), (zzdy) zzs.b(parcel, zzdy.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                I1(parcel.readString(), parcel.readString(), (Bundle) zzs.b(parcel, Bundle.CREATOR), zzs.e(parcel), zzs.e(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzs.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzdq) {
                        zzdsVar = (zzdq) queryLocalInterface;
                    } else {
                        zzdsVar = new zzds(readStrongBinder);
                    }
                    zzdqVar = zzdsVar;
                }
                o4(readString, readString2, bundle, zzdqVar, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 4:
                W2(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.C(parcel.readStrongBinder()), zzs.e(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean e2 = zzs.e(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzdq) {
                        zzdqVar2 = (zzdq) queryLocalInterface2;
                    } else {
                        zzdqVar2 = new zzds(readStrongBinder2);
                    }
                }
                j4(readString3, readString4, e2, zzdqVar2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzdq) {
                        zzdqVar13 = (zzdq) queryLocalInterface3;
                    } else {
                        zzdqVar13 = new zzds(readStrongBinder3);
                    }
                }
                M1(readString5, zzdqVar13);
                parcel2.writeNoException();
                return true;
            case 7:
                Z2(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 8:
                v0((Bundle) zzs.b(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 9:
                Z(parcel.readString(), parcel.readString(), (Bundle) zzs.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzdq) {
                        zzdqVar12 = (zzdq) queryLocalInterface4;
                    } else {
                        zzdqVar12 = new zzds(readStrongBinder4);
                    }
                }
                g7(readString6, readString7, zzdqVar12);
                parcel2.writeNoException();
                return true;
            case 11:
                d4(zzs.e(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 12:
                X1(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 13:
                F5(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 14:
                h5(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 15:
                C0(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzdq) {
                        zzdqVar11 = (zzdq) queryLocalInterface5;
                    } else {
                        zzdqVar11 = new zzds(readStrongBinder5);
                    }
                }
                X6(zzdqVar11);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzdq) {
                        zzdqVar10 = (zzdq) queryLocalInterface6;
                    } else {
                        zzdqVar10 = new zzds(readStrongBinder6);
                    }
                }
                f4(zzdqVar10);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzdw) {
                        zzdwVar = (zzdw) queryLocalInterface7;
                    } else {
                        zzdwVar = new zzdx(readStrongBinder7);
                    }
                }
                W6(zzdwVar);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzdq) {
                        zzdqVar9 = (zzdq) queryLocalInterface8;
                    } else {
                        zzdqVar9 = new zzds(readStrongBinder8);
                    }
                }
                N5(zzdqVar9);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzdq) {
                        zzdqVar8 = (zzdq) queryLocalInterface9;
                    } else {
                        zzdqVar8 = new zzds(readStrongBinder9);
                    }
                }
                d1(zzdqVar8);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzdq) {
                        zzdqVar7 = (zzdq) queryLocalInterface10;
                    } else {
                        zzdqVar7 = new zzds(readStrongBinder10);
                    }
                }
                x4(zzdqVar7);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzdq) {
                        zzdqVar6 = (zzdq) queryLocalInterface11;
                    } else {
                        zzdqVar6 = new zzds(readStrongBinder11);
                    }
                }
                c1(zzdqVar6);
                parcel2.writeNoException();
                return true;
            case 23:
                b4(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 24:
                B6(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                A6(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 26:
                x2(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 27:
                m6(IObjectWrapper.Stub.C(parcel.readStrongBinder()), (Bundle) zzs.b(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 28:
                S5(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 29:
                I6(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 30:
                J1(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper C = IObjectWrapper.Stub.C(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzdq) {
                        zzdqVar5 = (zzdq) queryLocalInterface12;
                    } else {
                        zzdqVar5 = new zzds(readStrongBinder12);
                    }
                }
                R0(C, zzdqVar5, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle2 = (Bundle) zzs.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzdq) {
                        zzdqVar4 = (zzdq) queryLocalInterface13;
                    } else {
                        zzdqVar4 = new zzds(readStrongBinder13);
                    }
                }
                T0(bundle2, zzdqVar4, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 33:
                W0(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.C(parcel.readStrongBinder()), IObjectWrapper.Stub.C(parcel.readStrongBinder()), IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzdt) {
                        zzdtVar3 = (zzdt) queryLocalInterface14;
                    } else {
                        zzdtVar3 = new zzdv(readStrongBinder14);
                    }
                }
                P2(zzdtVar3);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzdt) {
                        zzdtVar2 = (zzdt) queryLocalInterface15;
                    } else {
                        zzdtVar2 = new zzdv(readStrongBinder15);
                    }
                }
                p7(zzdtVar2);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzdt) {
                        zzdtVar = (zzdt) queryLocalInterface16;
                    } else {
                        zzdtVar = new zzdv(readStrongBinder16);
                    }
                }
                Q6(zzdtVar);
                parcel2.writeNoException();
                return true;
            case 37:
                m5(zzs.f(parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzdq) {
                        zzdqVar3 = (zzdq) queryLocalInterface17;
                    } else {
                        zzdqVar3 = new zzds(readStrongBinder17);
                    }
                }
                l6(zzdqVar3, parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

package androidx.work.impl.constraints;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import P5.d;
import Q5.b;
import X5.o;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m6.k;

/* loaded from: classes3.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController<?>> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController<?>> controllers) {
        AbstractC3159y.i(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        AbstractC3159y.i(workSpec, "workSpec");
        List<ConstraintController<?>> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.access$getTAG$p(), "Work " + workSpec.id + " constrained by " + AbstractC1246t.w0(arrayList, null, null, null, 0, null, WorkConstraintsTracker$areAllConstraintsMet$1.INSTANCE, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC3358f track(WorkSpec spec) {
        AbstractC3159y.i(spec, "spec");
        List<ConstraintController<?>> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ConstraintController) it.next()).track());
        }
        final InterfaceC3358f[] interfaceC3358fArr = (InterfaceC3358f[]) AbstractC1246t.W0(arrayList2).toArray(new InterfaceC3358f[0]);
        return AbstractC3360h.n(new InterfaceC3358f() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            static final class AnonymousClass2 extends AbstractC3160z implements Function0 {
                final /* synthetic */ InterfaceC3358f[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.$flowArray = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final ConstraintsState[] invoke() {
                    return new ConstraintsState[this.$flowArray.length];
                }
            }

            @f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass3 extends l implements o {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState constraintsState;
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
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                constraintsState = constraintsStateArr[i9];
                                if (!AbstractC3159y.d(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                    break;
                                }
                                i9++;
                            } else {
                                constraintsState = null;
                                break;
                            }
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (interfaceC3359g.emit(constraintsState, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, ConstraintsState[] constraintsStateArr, d dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = interfaceC3359g;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(I.f6487a);
                }
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, d dVar) {
                InterfaceC3358f[] interfaceC3358fArr2 = interfaceC3358fArr;
                Object a8 = k.a(interfaceC3359g, interfaceC3358fArr2, new AnonymousClass2(interfaceC3358fArr2), new AnonymousClass3(null), dVar);
                if (a8 == b.e()) {
                    return a8;
                }
                return I.f6487a;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController<?>>) AbstractC1246t.p(new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker())));
        AbstractC3159y.i(trackers, "trackers");
    }
}

package com.inmobi.cmp.core.model;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import j6.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import u5.AbstractC4062a;

/* loaded from: classes4.dex */
public final class Vector {

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, Boolean> f18894a;

    /* renamed from: b, reason: collision with root package name */
    public int f18895b;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {
        public a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            if (((Boolean) obj2).booleanValue()) {
                Vector.this.set(intValue);
            } else {
                Vector.this.unset(intValue);
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {
        public b() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (Vector.this.getMap().containsKey(Integer.valueOf(intValue))) {
                if (booleanValue) {
                    Vector.this.set(intValue);
                } else {
                    Vector.this.unset(intValue);
                }
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Vector f18899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Vector vector) {
            super(2);
            this.f18899b = vector;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            ((Boolean) obj2).booleanValue();
            Vector vector = Vector.this;
            if (vector != null && !vector.contains(intValue)) {
                this.f18899b.unset(intValue);
            }
            return I.f8278a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Vector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Vector copy$default(Vector vector, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = vector.f18894a;
        }
        return vector.copy(map);
    }

    public final void clear() {
        this.f18894a.clear();
    }

    public final Map<Integer, Boolean> component1() {
        return this.f18894a;
    }

    public final boolean contains(int i8) {
        return this.f18894a.containsKey(Integer.valueOf(i8));
    }

    public final Vector copy(Map<Integer, Boolean> map) {
        AbstractC3255y.i(map, "map");
        return new Vector(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Vector) && AbstractC3255y.d(this.f18894a, ((Vector) obj).f18894a);
    }

    public final void forEach(InterfaceC1668n action) {
        AbstractC3255y.i(action, "action");
        for (Map.Entry<Integer, Boolean> entry : this.f18894a.entrySet()) {
            action.invoke(entry.getKey(), entry.getValue());
        }
    }

    public final Boolean get(int i8) {
        return this.f18894a.get(Integer.valueOf(i8));
    }

    public final Set<Integer> getAcceptedItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = getMap().keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (AbstractC3255y.d(get(intValue), Boolean.TRUE)) {
                linkedHashSet.add(Integer.valueOf(intValue));
            }
        }
        return linkedHashSet;
    }

    public final int getBitLength() {
        return this.f18895b;
    }

    public final Set<Integer> getKeys() {
        return this.f18894a.keySet();
    }

    public final Map<Integer, Boolean> getMap() {
        return this.f18894a;
    }

    public final int getMaxId() {
        Integer num = (Integer) AbstractC1378t.A0(this.f18894a.keySet());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int hashCode() {
        return this.f18894a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f18894a.isEmpty();
    }

    public final void set(int i8) {
        this.f18894a.put(Integer.valueOf(i8), Boolean.TRUE);
    }

    public final void setAllOwnedItems() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f18894a.entrySet().iterator();
        while (it.hasNext()) {
            set(it.next().getKey().intValue());
        }
    }

    public final void setBitLength(int i8) {
        this.f18895b = i8;
    }

    public final void setItems(Set<Integer> ids) {
        AbstractC3255y.i(ids, "ids");
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            getMap().put(Integer.valueOf(((Number) it.next()).intValue()), Boolean.TRUE);
            setBitLength(0);
        }
    }

    public final void setMap(Map<Integer, Boolean> map) {
        AbstractC3255y.i(map, "<set-?>");
        this.f18894a = map;
    }

    public final void setOwnedItems(Vector vector) {
        if (vector != null) {
            vector.forEach(new b());
        }
    }

    public final int size() {
        return this.f18894a.size();
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("Vector(map=");
        a8.append(this.f18894a);
        a8.append(')');
        return a8.toString();
    }

    public final void unset(int i8) {
        this.f18894a.put(Integer.valueOf(i8), Boolean.FALSE);
        this.f18895b = 0;
    }

    public final void unsetAllOwnedItems() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f18894a.entrySet().iterator();
        while (it.hasNext()) {
            unset(it.next().getKey().intValue());
        }
    }

    public Vector(Map<Integer, Boolean> map) {
        AbstractC3255y.i(map, "map");
        this.f18894a = map;
    }

    public final void set(Vector vector) {
        if (vector == null) {
            return;
        }
        vector.forEach(new a());
    }

    public final void set(Set<String> ids) {
        AbstractC3255y.i(ids, "ids");
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            Integer i8 = n.i((String) it.next());
            if (i8 != null) {
                getMap().put(Integer.valueOf(i8.intValue()), Boolean.TRUE);
                setBitLength(0);
            }
        }
    }

    public final void unset(Vector vector) {
        forEach(new c(this));
    }

    public /* synthetic */ Vector(Map map, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map);
    }

    public final void unset(Set<Integer> ids) {
        AbstractC3255y.i(ids, "ids");
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            getMap().put(Integer.valueOf(((Number) it.next()).intValue()), Boolean.FALSE);
            setBitLength(0);
        }
    }
}

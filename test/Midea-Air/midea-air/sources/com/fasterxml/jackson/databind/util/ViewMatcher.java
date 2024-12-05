package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();

    /* loaded from: classes2.dex */
    private static final class Multi extends ViewMatcher implements Serializable {
        private final Class<?>[] _views;

        public Multi(Class<?>[] clsArr) {
            this._views = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            int length = this._views.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls2 = this._views[i2];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private static final class Single extends ViewMatcher {
        private final Class<?> _view;

        public Single(Class<?> cls) {
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        if (clsArr == null) {
            return EMPTY;
        }
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length != 1) {
            return new Multi(clsArr);
        }
        return new Single(clsArr[0]);
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class PropertyName implements Serializable {
    protected SerializableString _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;
    public static final PropertyName USE_DEFAULT = new PropertyName(HttpUrl.FRAGMENT_ENCODE_SET, null);
    public static final PropertyName NO_NAME = new PropertyName(new String(HttpUrl.FRAGMENT_ENCODE_SET), null);

    public PropertyName(String str) {
        this(str, null);
    }

    public static PropertyName construct(String str) {
        if (str != null && str.length() != 0) {
            return new PropertyName(InternCache.instance.intern(str), null);
        }
        return USE_DEFAULT;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != PropertyName.class) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        if (str2 == null) {
            return propertyName._namespace == null;
        }
        return str2.equals(propertyName._namespace);
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName() {
        return this._simpleName.length() > 0;
    }

    public int hashCode() {
        String str = this._namespace;
        if (str == null) {
            return this._simpleName.hashCode();
        }
        return str.hashCode() ^ this._simpleName.hashCode();
    }

    public PropertyName internSimpleName() {
        String intern;
        return (this._simpleName.length() == 0 || (intern = InternCache.instance.intern(this._simpleName)) == this._simpleName) ? this : new PropertyName(intern, this._namespace);
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    protected Object readResolve() {
        String str = this._simpleName;
        if (str == null || HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
            return USE_DEFAULT;
        }
        return (this._simpleName.equals(HttpUrl.FRAGMENT_ENCODE_SET) && this._namespace == null) ? NO_NAME : this;
    }

    public SerializableString simpleAsEncoded(MapperConfig<?> mapperConfig) {
        SerializableString compileString;
        SerializableString serializableString = this._encodedSimple;
        if (serializableString != null) {
            return serializableString;
        }
        if (mapperConfig == null) {
            compileString = new SerializedString(this._simpleName);
        } else {
            compileString = mapperConfig.compileString(this._simpleName);
        }
        SerializableString serializableString2 = compileString;
        this._encodedSimple = serializableString2;
        return serializableString2;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        return "{" + this._namespace + "}" + this._simpleName;
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }

    public PropertyName(String str, String str2) {
        this._simpleName = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this._namespace = str2;
    }

    public boolean hasSimpleName(String str) {
        if (str == null) {
            return this._simpleName == null;
        }
        return str.equals(this._simpleName);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null && str.length() == 0) {
            return USE_DEFAULT;
        }
        return new PropertyName(InternCache.instance.intern(str), str2);
    }
}

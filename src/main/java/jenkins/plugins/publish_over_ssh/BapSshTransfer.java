package jenkins.plugins.publish_over_ssh;

import jenkins.plugins.publish_over.BPTransfer;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.kohsuke.stapler.DataBoundConstructor;

public class BapSshTransfer extends BPTransfer {

    static final long serialVersionUID = 1L;
    
    @DataBoundConstructor
    public BapSshTransfer(String sourceFiles, String remoteDirectory, String removePrefix, boolean remoteDirectorySDF, boolean flatten) {
        super(sourceFiles, remoteDirectory, removePrefix, remoteDirectorySDF, flatten);
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BapSshTransfer that = (BapSshTransfer) o;
        
        return createEqualsBuilder(that)
            .isEquals();
    }

    public int hashCode() {
        return createHashCodeBuilder()
            .toHashCode();
    }
    
    public String toString() {
        return addToToString(new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE))
            .toString();
    }
    
    
}

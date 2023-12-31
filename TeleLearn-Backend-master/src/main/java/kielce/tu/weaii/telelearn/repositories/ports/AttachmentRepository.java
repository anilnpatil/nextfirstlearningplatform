package kielce.tu.weaii.telelearn.repositories.ports;

import kielce.tu.weaii.telelearn.models.Attachment;

import java.util.Optional;

public interface AttachmentRepository {
    Optional<Attachment> getById(Long id);

    void delete(Attachment attachment);
}

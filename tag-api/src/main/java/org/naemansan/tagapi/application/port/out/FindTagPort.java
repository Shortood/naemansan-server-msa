package org.naemansan.tagapi.application.port.out;

import org.naemansan.tagapi.dto.request.TagDto;

import java.util.List;

public interface FindTagPort {
    List<TagDto> findAll(List<Long> ids);
}

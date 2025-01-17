package capstone.code.repositories;

import capstone.code.domain.InhousePart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InhousePartRepositoryTest {
    InhousePartRepository inhousePartRepository;
    @BeforeEach
    void setUp() {
        inhousePartRepository=mock(InhousePartRepository.class);
    }
    @Test
    void findAll() {
        InhousePart part=new InhousePart();
        List partData=new ArrayList();
        partData.add(part);
        when(inhousePartRepository.findAll()).thenReturn(partData);
        List<InhousePart> parts=(List<InhousePart>)inhousePartRepository.findAll();
        assertEquals(partData.size(),1);
    }
}